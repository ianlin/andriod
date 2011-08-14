package net.radzebra.itTalent ;
import net.radzebra.itTalent.dao.* ;

import java.util.*;
import java.io.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
* A simple Talent database to record group members' story.
* It based on sqlite and iBatis
*  taosheng.chen[at]gmail.com
*/
public class TalentManager{
    private String RESOURCE = "mybatisConfig.xml"; 
    private SqlSession SQL_SESSION ;
    /** An empty Talent instance*/
    public TalentManager()throws Exception{
        Reader reader = Resources.getResourceAsReader(RESOURCE); 
        this.SQL_SESSION = new SqlSessionFactoryBuilder().build(reader).openSession();

        this.SQL_SESSION.getConnection().setAutoCommit(true);
        
    }
    /** A given id to manage a talent */
    public TalentManager(String id){
    }
    /** Add new talent in datbase*/
    public void addTalent(Talent talent){
        TalentMapper talentMapper = this.SQL_SESSION.getMapper(TalentMapper.class);
        talentMapper.insert(talent);
    } 
    public void deleteTalentById(String id){
        TalentMapper talentMapper = this.SQL_SESSION.getMapper(TalentMapper.class);
        talentMapper.deleteByPrimaryKey(id);
    }
    public List<Talent> selectTalentByEmail(String email){

        TalentExample talentExample = new TalentExample();
        TalentExample.Criteria criteria = talentExample.createCriteria();
        criteria.andEmailLike(email);
        TalentMapper talentMapper = this.SQL_SESSION.getMapper(TalentMapper.class);
        List<Talent> talentList = talentMapper.selectByExample(talentExample);
        return talentList ;
     
    }

    public static void main(String arg[])throws Exception{
        println("demo the Talent class");
        TalentManager tm = new TalentManager();

        Talent t = new Talent();
        t.setId("0000002");
        t.setName("radZebra-2");
        t.setCellPhone("02-3939889");
        t.setEmail("radZebra@gmail.com") ;
        t.setBirthYear("2011");
        t.setDesc("a default user of talent manager");

        tm.addTalent(t);
	println("talent added...");
        List<Talent> listTalent = tm.selectTalentByEmail("%radZebra%");
        for (Talent oneTalent : listTalent) {
            println("talent:"+oneTalent);
        }
	println("talent selected...via email:radZebra");
       
        tm.deleteTalentById("0000002") ;
	println("talent deleted...");

    }



    // wrapper of System.out.println
    private static void println(Object msg){
        System.out.println(msg);
    }
}

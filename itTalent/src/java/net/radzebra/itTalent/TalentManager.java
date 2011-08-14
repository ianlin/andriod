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
    /** An empty Talent instance*/
    public TalentManager(){
        
    }
    /** A given id to manage a talent */
    public TalentManager(String id){
    }
    /** Add new talent in datbase*/
    public void addTalent(Object o){
   
    } 

    public static void main(String arg[])throws Exception{
        println("demo the Talent class");
        TalentManager tm = new TalentManager();
        tm.addTalent("newtel");

        String resource = "mybatisConfig.xml"; 
        Reader reader = Resources.getResourceAsReader(resource); 
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(reader).openSession();

        sqlSession.getConnection().setAutoCommit(true);
        
        TalentMapper talentMapper = sqlSession.getMapper(TalentMapper.class);
        Talent t = new Talent();
        t.setId("0000001");
        t.setName("radZebra");
        t.setCellPhone("02-3939889");
        t.setEmail("radZebra@gmail.com") ;
        t.setBirthYear("2011");
        t.setDesc("a default user of talent manager");

        talentMapper.insert(t);
        sqlSession.close();
    }



    // wrapper of System.out.println
    private static void println(Object msg){
        System.out.println(msg);
    }
}

package net.radzebra.itTalent ;

import java.util.*;
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
    }



    // wrapper of System.out.println
    private static void println(Object msg){
        System.out.println(msg);
    }
}

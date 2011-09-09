package net.radzebra.itTalent.servlet ;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import net.radzebra.itTalent.*;
import net.radzebra.itTalent.dao.*;
import com.google.gson.*;
import com.google.gson.reflect.*; 

public class TalentServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException,IOException{
	res.setContentType("text/plain; charset=UTF-8");
        PrintWriter output = res.getWriter();
        StringBuffer outputBuffer = new StringBuffer();
//	ServletContext context = req.getContext();
        String contextPath = req.getContextPath();
        String requestURI = req.getRequestURI();
	BufferedReader  reader = req.getReader();
        // TODO a config to determind the actions
        String[] requestURIParts = requestURI.split("/");
        String targetClass = requestURIParts[2];
        String targetAction = requestURIParts[3] ;
        String name="";
        try{

//	    TalentManager tm = new TalentManager();
	    
            Gson gson = new Gson();
	    Talent oneTalent = gson.fromJson(reader, Talent.class);
	    TalentManager tManager = new TalentManager();
            name = oneTalent.getName();
            tManager.addTalent(oneTalent);

      //      List<Talent> listTalent = tm.selectTalentByEmail("%rad%");
      //      for (Talent oneTalent : listTalent) {
      //          outputBuffer.append("talent:"+oneTalent+" ");
      //      }
        }catch(Exception e){
            throw new ServletException(e);
	}
        
        outputBuffer.append("{'response':'OK'}");
	output.println(outputBuffer.toString() );
        output.close();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{
        this.doGet(req,res);
    }
}


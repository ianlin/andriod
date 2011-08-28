
package net.radzebra.itTalent.servlet ;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import net.radzebra.itTalent.*;
import net.radzebra.itTalent.dao.*;

public class TalentServlet extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException,IOException{
	res.setContentType("text/html; charset=UTF-8");
        PrintWriter output = res.getWriter();
        StringBuffer outputBuffer = new StringBuffer();

        try{
	    TalentManager tm = new TalentManager();
            outputBuffer.append("<html><body>");
            List<Talent> listTalent = tm.selectTalentByEmail("%rad%");
            for (Talent oneTalent : listTalent) {
                outputBuffer.append("talent:"+oneTalent+" ");
            }
        }catch(Exception e){
            throw new ServletException(e);
	}
        
        outputBuffer.append("</body><html>");
	output.println(outputBuffer.toString() );
        output.close();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{
        this.doGet(req,res);
    }
}


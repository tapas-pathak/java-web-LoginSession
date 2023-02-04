/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pradipta Pathak
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        
        String uname=request.getParameter("uname");
        String pass=request.getParameter("pass");
        
        if(uname.equals("arnab") && pass.equals("123"))
        {
            HttpSession session=request.getSession(true);
            session.putValue("username", uname);
            
            response.sendRedirect(request.getContextPath()+"/secondServlet");
        
        
        }
        else
        {
         out.println("fail");
        }
        
      
        
    }

    

}

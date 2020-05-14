
package com.mycompany.lunatic_coders_usermanagementsystem.controller;

import com.mycompany.lunatic_coders_usermanagementsystem.dao.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class Login extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        LoginDao loginDao = new LoginDao();
        
   
        
        String username = request.getParameter("uname");
        String password = request.getParameter("pass");
        
        String status = loginDao.authenticate(username, password);
        
        if(status.equals("true")){
            response.sendRedirect("dashboard.jsp");
        }
        
        if(status.equals("false")){
            response.sendRedirect("login.jsp?status=false");
        }
        
        if(status.equals("error")){
            response.sendRedirect("login.jsp?status=error");
        }
    }

}

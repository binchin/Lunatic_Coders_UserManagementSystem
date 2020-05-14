
package com.mycompany.lunatic_coders_usermanagementsystem.controller;

import com.mycompany.lunatic_coders_usermanagementsystem.dao.UserDao;
import com.mycompany.lunatic_coders_usermanagementsystem.model.UserModel;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class Signup extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("signup.jsp");
       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
           UserDao userDao = new UserDao();
           System.out.println("reached into post method");
        try{  
        java.util.Date dob = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("dob"));
        java.sql.Date sqlDate = new java.sql.Date(dob.getTime());
        
        userDao.insertUser(request.getParameter("firstname"),request.getParameter("lastname"),request.getParameter("username"),request.getParameter("address"),request.getParameter("contactno"),sqlDate,request.getParameter("email"),request.getParameter("password"));
        response.sendRedirect("login.jsp");
        
        }catch(ParseException e){
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE,null,e);
            response.sendRedirect("signup");
        }
        
        
       
        
        
      
    }

}

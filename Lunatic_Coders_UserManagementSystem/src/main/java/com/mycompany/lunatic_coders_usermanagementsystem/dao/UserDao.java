
package com.mycompany.lunatic_coders_usermanagementsystem.dao;

import com.mycompany.lunatic_coders_usermanagementsystem.dbconnection.DBConnection;
import com.mycompany.lunatic_coders_usermanagementsystem.model.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;


public class UserDao {
      Connection connection = null;
      Statement statement = null;
      ResultSet resultSet= null;
      PreparedStatement preparedStatement = null;
      private static final String CREATE_USERS_SQL= "INSERT INTO user(first_name,last_name,user_name,address,contact_no,DOB,email_address,password,account_creation_date,is_admin)VALUES" +
        " (?, ?,?,?,?,?,?,?,?,?);";
      
      public UserDao(){
          
      }
      
    public void insertUser(String firstname, String lastname, String username, String address, String contactno, java.sql.Date dob, String email, String password) {
         try{
             System.out.println("Reached insert user");
             connection = DBConnection.openConnection();
             preparedStatement = connection.prepareStatement(CREATE_USERS_SQL);
             java.sql.Timestamp accountCreatedDate = new java.sql.Timestamp(new java.util.Date().getTime());
             preparedStatement.setString(1, firstname);
             preparedStatement.setString(2, lastname);
             preparedStatement.setString(3, username);
             preparedStatement.setString(4, address);
             preparedStatement.setString(5, contactno);
             preparedStatement.setDate(6,dob);
             preparedStatement.setString(7,email);
             preparedStatement.setString(8,password);
             preparedStatement.setTimestamp(9, accountCreatedDate);
             preparedStatement.setBoolean(10, false);
             preparedStatement.executeUpdate();
             
    }catch(SQLException e){
        e.printStackTrace();
        
    }}
      
      
      
      
      
}

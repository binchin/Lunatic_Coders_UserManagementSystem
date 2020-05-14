package com.mycompany.lunatic_coders_usermanagementsystem.dao;

import com.mycompany.lunatic_coders_usermanagementsystem.controller.Login;
import com.mycompany.lunatic_coders_usermanagementsystem.dbconnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {

    public LoginDao() {

    }

    public String authenticate(String username, String password) {
        String sql = "select * from user where user_name=? and password=?";

        try {
            Connection connection = DBConnection.openConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet rs =  preparedStatement.executeQuery();
            
            if(rs.next()){
                return "true";
                
            }else{
                return "false";
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return "error";
    }

}

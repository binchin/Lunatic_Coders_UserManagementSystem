
package com.mycompany.lunatic_coders_usermanagementsystem.dbconnection;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    //Defining database properties
    //URL,DRIVER,USERNAME,PASSWORD,Connection variable 
    
    private static final String URL="jdbc:mysql://localhost/usermanagementsystem?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static Connection connection=null;
    
    //Get the database connection
    
  public static Connection openConnection(){
    if(connection!=null)
        return connection;
    
    else{
    
    try{
    Class.forName(DRIVER);
    connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }catch(ClassNotFoundException e){
        e.printStackTrace();
    }catch(SQLException e){
        e.printStackTrace();
    }
    return connection;
    }
    }
    
    
}

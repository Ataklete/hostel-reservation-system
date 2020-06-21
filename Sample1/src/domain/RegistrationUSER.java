/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import MyfirstForm.MY_CONNECTION;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atakl
 */
public class RegistrationUSER {
    
     Connection my_connection = MY_CONNECTION.createConnection();
     
     private String username;
     private String password;
     private String role;

    public RegistrationUSER(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

 

    public RegistrationUSER() {
       
    }

    public Connection getMy_connection() {
        return my_connection;
    }

    public void setMy_connection(Connection my_connection) {
        this.my_connection = my_connection;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}     
    
//    public boolean addClient( String fname, String password, String role)
//            
//    {
//        PreparedStatement st;
//        ResultSet rs;
//        String addQuery = " INSERT INTO `users`( `username`, `password`, `role`) VALUES (?,?,?)";
//        
//        try {
//            st = my_connection.prepareStatement(addQuery);
//            st.setString(1, fname);
//            st.setString(2, password);
//            st.setString(3, role);
//            
//            
//            if(st.executeUpdate()>=0)
//           {
//              return true;
//           }else {
//                return false;
//           }
//                    
//                    } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//             return false;
//        }
//        
//      
//    }
//}

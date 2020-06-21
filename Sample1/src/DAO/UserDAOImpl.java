/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MyfirstForm.MY_CONNECTION;
import MyfirstForm.RegistrationForm;
import domain.Customer;
import domain.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author atakl
 */
public class UserDAOImpl implements UserDAO {

    Connection my_connection = MY_CONNECTION.createConnection();

    @Override
    public User getById(String username1) {
        User user = null;
        // get user using username
        PreparedStatement ps;
        ResultSet rs;

        Connection myconnection = MY_CONNECTION.createConnection();

        String selectQuery = "SELECT * FROM `users` WHERE `username` =?";
        try {
            ps = myconnection.prepareStatement(selectQuery);

            ps.setString(1, username1);

            rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();

                // if theis user exist open the main form and close
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));

            } else {
                //if the user Enter the wrong information
                // throw new RuntimeException();

            }
            return user;

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }

    }

    @Override
    public boolean registrationUsers(User user) {

        try {
            PreparedStatement st;
            ResultSet rs;
            String addQuery = " INSERT INTO `users`( `username`, `password`, `role`) VALUES (?,?,?)";

            st = my_connection.prepareStatement(addQuery);
            st.setString(1, user.getUsername());
            st.setString(2, user.getPassword());
            st.setString(3, user.getRole());

            if (st.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}

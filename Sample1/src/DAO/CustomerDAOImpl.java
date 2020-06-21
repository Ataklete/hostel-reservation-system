/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MyfirstForm.MY_CONNECTION;
import domain.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atakl
 */
public class CustomerDAOImpl implements CustomerDAO {

    Connection my_connection = MY_CONNECTION.createConnection();

    @Override
    public Customer addClient(Customer customer) {
        // public boolean addClient( String fname, String lname, String phone, String description)
        //  cus = new Customer1();

        PreparedStatement st;
        ResultSet rs;
        String addQuery = " INSERT INTO `clients`( `first_name`, `last_name`, `phone`, `description`) VALUES (?,?,?,?)";

        try {
            st = my_connection.prepareStatement(addQuery, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, customer.getFirstName());
            st.setString(2, customer.getLastName());
            st.setString(3, customer.getPhone());
            st.setString(4, customer.getDes());

            if (st.executeUpdate() >= 0) {
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    customer.setId(rs.getInt(1));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);

        }

        return customer;

    }

    @Override
    public List<Customer> loadCustomers() {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `clients`";
        List<Customer> customers = new ArrayList<>();
        try {

            ps = my_connection.prepareStatement(selectQuery);

            rs = ps.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt(1));
                customer.setFirstName(rs.getString(2));
                customer.setLastName(rs.getString(3));
                customer.setPhone(rs.getString(4));
                customer.setDes(rs.getString(5));
                customers.add(customer);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    @Override
    public boolean editClient(Customer customer) {
        try {
            PreparedStatement st;
            ResultSet rs;
            String editQuery = "UPDATE `clients` SET `first_name`=?,`last_name`=?,`phone`=?,`description`=? WHERE `id`=?";
            
            //     try {
            
            st = my_connection.prepareStatement(editQuery);
           // st = my_connection.prepareStatement(editQuery, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, customer.getFirstName());
            st.setString(2, customer.getLastName());
            st.setString(3, customer.getPhone());
            st.setString(4, customer.getDes());
            st.setInt(5, customer.getId());
            
            if (st.executeUpdate() >= 0) 

                return true;
              
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
  return false;
    }
    
    @Override
    public boolean removeClient(int id) {
           PreparedStatement st;
           ResultSet rs;
          
        String deleteQuery = "DELETE  FROM `clients` WHERE `id`=?";

        try {

            st = my_connection.prepareStatement(deleteQuery);

            st.setInt(1, id);

            return (st.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Customer refreshClient(Customer customer) {
        
       return customer;
    }
}

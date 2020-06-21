/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.CustomerDAO;
import DAO.CustomerDAOImpl;
import domain.Customer;
import java.util.List;

/**
 *
 * @author atakl
 */
public class CustomerController {

    private CustomerDAO cusDAO = new CustomerDAOImpl();

    public List<Customer> loadCustomers() {
        // load all customers using DAO
        List<Customer> customers = cusDAO.loadCustomers();
        return customers;
    }

    public Customer addCustomer(String fname, String lname, String phone, String des) {
        // create Customer Object and pass to DAO

        Customer customer = new Customer(fname, lname, phone, des);
        //get data from customer dao

        customer = cusDAO.addClient(customer);

        return customer;
    }
    
    public Customer updateCustomer(int id,String fname, String lname, String phone, String des){
        
        // edit Customer Object and pass to DAO

        Customer customer = new Customer(fname, lname, phone, des);
        customer.setId(id);
        //get data from customer dao

         cusDAO.editClient(customer);
       
        return customer;
        
     
    }
    
    public void removeCustomer(int id){
        
      

        boolean customer = cusDAO.removeClient(id);

        //return customer;
        
    }


}

package controllers;


import DAO.UserDAO;
import DAO.UserDAOImpl;
import domain.Customer;
import domain.RegistrationUSER;
import domain.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atakl
 */
public class UserController {
    private UserDAO userDAO = new UserDAOImpl();
   // private CustomerDAO cusDAO = new CustomerDAOImpl();
    RegistrationUSER reg= new RegistrationUSER();
    
    public String login(String username, String password){
        //get user from user dao
        User user = userDAO.getById(username);
        if(user==null){
            throw new RuntimeException("User not found in database");
        }
        // check password
        if(!user.getPassword().equals(password)){
            throw new RuntimeException("Password provided is incorrect");
        }
        return user.getRole();   
    }
    public User registration(String name,String password,String role){
     
        User user = new User(name,password,role);
        //get data from user dao

        userDAO.registrationUsers(user);

        return user;
    }

}

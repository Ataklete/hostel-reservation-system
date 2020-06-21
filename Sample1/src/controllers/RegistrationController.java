/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.ReservationDAO;
import DAO.ReservationDAOImpl;
import DAO.RoomDAO;
import DAO.RoomDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import domain.All_Rooms;
import domain.RegistrationUSER;
import domain.Reservation;
import domain.User;

/**
 *
 * @author atakl
 */
public class RegistrationController {
    private UserDAO userDAO = new UserDAOImpl();
   // private CustomerDAO cusDAO = new CustomerDAOImpl();
    RegistrationUSER reg= new RegistrationUSER();
   public User registration(String name,String password,String role){
     
        User user = new User(name,password,role);
        //get data from user dao

        userDAO.registrationUsers(user);

        return user;
    }  
}

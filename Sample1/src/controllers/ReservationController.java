/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.ReservationDAO;
import DAO.ReservationDAOImpl;
import domain.Customer;
import domain.Reservation;
import domain.Rooms;
import java.util.Date;
import java.util.List;

/**
 *
 * @author atakl
 */
public class ReservationController {
    private ReservationDAO reservationDao = new ReservationDAOImpl();
    private Reservation reserv = new Reservation();
    
    public Reservation addReservaton(int clientNo, int roomNo, Date datein, Date dateout) {
        // create Reservation Object and pass to DAO

        Reservation re = new Reservation(clientNo, roomNo, datein, dateout);
        //get data from reservation dao

        re = reservationDao.addReservation(re);

        return re;
    }
    public List<Reservation> loadReservation() {
        // load all reservation using DAO
        List<Reservation> reservation = reservationDao.loadreservation();
        return reservation;
    }
    
    public void removeReservation(int reservationId){
       boolean res = reservationDao.removeReservation(reservationId);
       //return true;
    }
    
    public Reservation updateReservation(int re,int clientNumber, int roomNo, Date din, Date dout){
        
        // edit reseervation Object and pass to DAO

        Reservation reservation = new Reservation(re,clientNumber, roomNo, din, dout);
      
        //get data from reservation dao

         reservationDao.editReservation(reservation);
       
        return reservation;
        
     
    } 
}

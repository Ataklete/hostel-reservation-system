/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MyfirstForm.MY_CONNECTION;
import domain.Customer;
import domain.Reservation;
import domain.Rooms;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author atakl
 */
public class ReservationDAOImpl implements ReservationDAO {
    Connection my_connection = MY_CONNECTION.createConnection();
    
     public Reservation addReservation(Reservation reservation)
    {
       
        PreparedStatement st;
        ResultSet rs;
        String addQuery = "INSERT INTO `reservation`(`Client_id`, `Room_number`, `date_in`, `date_out`) VALUES (?,?,?,?)";
        
        try {
            
            st = my_connection.prepareStatement(addQuery, Statement.RETURN_GENERATED_KEYS);
            
            st.setInt(1, reservation.getClientId());
            st.setInt(2,  reservation.getRoomNo());
            st.setDate(3,  new java.sql.Date(reservation.getDateIn().getTime()));
            st.setDate(4, new java.sql.Date(reservation.getDateOut().getTime()));
            
    if (st.executeUpdate() >= 0) {
                rs = st.getGeneratedKeys();
                if (rs.next()) {
                    reservation.setId(rs.getInt(1));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);

        }

       
   return reservation;
    }
   
     //   create a function to edit the selected room
       @Override
    public boolean editReservation(Reservation reservation){
        PreparedStatement st;
        String editQuery = "UPDATE `reservation` SET `client_id`=?,`room_number`=?,`date_in`=?,`date_out`=? WHERE `id`=?";
        
        try {
            
            st = my_connection.prepareStatement(editQuery);
            
            st.setInt(1, reservation.getClientId());
            st.setInt(2, reservation.getRoomNo());
            st.setDate(3, new java.sql.Date(reservation.getDateIn().getTime()));
            st.setDate(4, new java.sql.Date(reservation.getDateOut().getTime()));
            st.setInt(5, reservation.getId());
            
           if (st.executeUpdate() > 0);
             return true;
           } 
           catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
       // return false;
    }
    @Override
    public List<Reservation> loadreservation() {
       PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `reservation`";
        List<Reservation> reservation = new ArrayList<>();
        try {

            ps = my_connection.prepareStatement(selectQuery);

            rs = ps.executeQuery();

            while (rs.next()) {
                Reservation reserv = new Reservation();
                reserv.setId(rs.getInt(1));
                reserv.setClientId(rs.getInt(2));
                reserv.setRoomNo(rs.getInt(3));
                reserv.setDateIn(rs.getDate(4));
                reserv.setDateOut(rs.getDate(5));
                reservation.add(reserv);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reservation;
    }
      
    //   create a function to remove the selected reservation
    @Override
    public boolean removeReservation(int reservation_id){
        Rooms room = new Rooms();
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `reservation` WHERE `id`=?";
        
        try {
            
            st = my_connection.prepareStatement(deleteQuery);

            st.setInt(1, reservation_id);
            
            // we need to get the room number before delting the reservation
            int room_number = getRoomNumberFromReservation(reservation_id);
            
            if (st.executeUpdate() > 0)
            {
                room.setRoomToReserved(room_number, "No");
                return true;
                
            }else{
                
                return false;
            }
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        // create a function to get the room number from a reservation
    public int getRoomNumberFromReservation(int reservationID)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT `room_number` FROM `reservation` WHERE `id` = ?";
        
        try {
            
            ps = my_connection.prepareStatement(selectQuery);
            
            ps.setInt(1, reservationID);
            
            rs = ps.executeQuery();
            
            if(rs.next()) 
            {
                return rs.getInt(1);
            }
            else{
                return 0;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } 
    }
}

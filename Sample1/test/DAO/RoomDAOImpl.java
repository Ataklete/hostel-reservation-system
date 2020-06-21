/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MyfirstForm.All_Rooms_Type;
import MyfirstForm.MY_CONNECTION;
import domain.All_Rooms;
import domain.Customer;
import domain.Rooms;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author atakl
 */
public class RoomDAOImpl implements RoomDAO {

    Connection my_connection = MY_CONNECTION.createConnection();

    @Override
    public Rooms addRoom(Rooms room) {
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "INSERT INTO `rooms`( `r_number`, `type`, `phone`, `reserved`) VALUES (?,?,?,?)";

        try {
            st = my_connection.prepareStatement(editQuery);
            //st.setString(1, room.getRoomNo());
            st.setInt(1, room.getRoomNo());
            st.setInt(2, room.getType());
            st.setString(3, room.getNoOfRooms());
            // the reserved column mean i this room is free or not, default is no
            st.setString(4, "No");

            st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);

        }

        return room;
    }

    public List<Rooms> loadRoom() {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `rooms`";
        List<Rooms> rooms = new ArrayList<>();
        try {

            ps = my_connection.prepareStatement(selectQuery);

            rs = ps.executeQuery();

            while (rs.next()) {
                Rooms room = new Rooms();
                room.setRoomNo(rs.getInt(1));
                room.setType(rs.getInt(2));
                room.setNoOfRooms(rs.getString(3));
                room.setReserved(rs.getString(4));

                rooms.add(room);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);

        }
        return rooms;
    }

    @Override
    public List<All_Rooms> roomType() {
        All_Rooms roomType = new All_Rooms();
        All_Rooms_Type roomTemp = new All_Rooms_Type();
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        List<All_Rooms> rooms = new ArrayList<>();
        try {

            ps = my_connection.prepareStatement(selectQuery);

            rs = ps.executeQuery();

            while (rs.next()) {

                roomType.setTypeNumber(rs.getInt(1));
                roomType.setTypeName(rs.getString(2));
                roomType.setPrice(rs.getInt(3));
                rooms.add(roomType);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rooms;

    }

    @Override
    public List<Integer> loadTypes() {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        List<Integer> typeList = new ArrayList<>();

        try {

            ps = my_connection.prepareStatement(selectQuery);

            rs = ps.executeQuery();
            while (rs.next()) {
                typeList.add(rs.getInt(1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return typeList;
    }

    @Override
    public boolean editRoom(Rooms room) {
        
        try{
        PreparedStatement st;
        String editQuery = "UPDATE `rooms` SET `type`=?,`phone`=?,`reserved`=? WHERE `r_number`=?";
        
       
            
            st = my_connection.prepareStatement(editQuery);
              
            
//           
            st.setInt(1, room.getType());
            st.setString(2, room.getNoOfRooms());
            st.setString(3, room.getReserved());
             st.setInt(4, room.getRoomNo());
          
            
       if (st.executeUpdate() >= 0) 

                return true;
              
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
  return false;
    }    

    @Override
    public boolean removeRoom(int id){
        PreparedStatement st;
        String deleteQuery = "DELETE FROM `rooms` WHERE `r_number`=?";
        
        try {
            
            st = my_connection.prepareStatement(deleteQuery);

            st.setInt(1, id);

            return (st.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }    
}

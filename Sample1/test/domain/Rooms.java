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
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author atakl
 */
public class Rooms {
    private int roomNo;
    private int type;
    private String noOfRooms;
    private String reserved;

   

    public Rooms(int roomNo, int type, String noOfRooms) {
        this.roomNo = roomNo;
        this.type = type;
        this.noOfRooms = noOfRooms;
    }

    public Rooms(int roomNo, int type, String noOfRooms, String reserved) {
        this.roomNo = roomNo;
        this.type = type;
        this.noOfRooms = noOfRooms;
        this.reserved = reserved;
    }
    
   

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public Connection getMy_connection() {
        return my_connection;
    }

    public void setMy_connection(Connection my_connection) {
        this.my_connection = my_connection;
    }

  
    
    Connection my_connection = MY_CONNECTION.createConnection();

    public Rooms() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void fillRooms_TYPE_JTable(JTable table)
    {
        PreparedStatement ps;
        ResultSet rs;
        String selectQuery = "SELECT * FROM `type`";
        
        try {
            
            ps = my_connection.prepareStatement(selectQuery);
            
            rs = ps.executeQuery();
            
            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next())
            {
               row = new Object[3];
               row[0] = rs.getInt(1);
               row[1] = rs.getString(2);
               row[2] = rs.getString(3);
               
         
               tableModel.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
}
     
//       public void fillRooms_TYPE_JCombobox(JComboBox combobox)
//    {
//        PreparedStatement ps;
//        ResultSet rs;
//        String selectQuery = "SELECT * FROM `type`";
//        
//        try {
//            
//            ps = my_connection.prepareStatement(selectQuery);
//            
//            rs = ps.executeQuery();
//            
//
//            while(rs.next())
//            {
//               combobox.addItem(rs.getInt(1));
//            }
//           
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        }
//}
//     public boolean addRoom(int num,int type, String phone)
//    {
//        PreparedStatement st;
//        String editQuery = "INSERT INTO `rooms`( `r_number`, `type`, `phone`, `reserved`) VALUES (?,?,?,?)";
//        
//        try {
//            
//            st = my_connection.prepareStatement(editQuery);
//            
//            st.setInt(1, num);
//            st.setInt(2, type);
//            st.setString(3, phone);
//            // the reserved column mean i this room is free or not, default is no
//            st.setString(4, "No");
//           
//          
//            
//            return (st.executeUpdate() > 0);
//             
//           } 
//           catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
     
//     public boolean editRoom(int number,int type, String phone, String isReserved)
//    {
//        PreparedStatement st;
//        String editQuery = "UPDATE `rooms` SET `type`=?,`phone`=?,`reserved`=? WHERE `r_number`=?";
//        
//        try {
//            
//            st = my_connection.prepareStatement(editQuery);
//            
//            st.setInt(1, type);
//            st.setString(2, phone);
//            st.setString(3, isReserved);
//            st.setInt(4, number);
//            
//            return (st.executeUpdate() > 0);
//             
//           } 
//           catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
     
//      public boolean removeRoom(int roomNumber)
//    {
//        PreparedStatement st;
//        String deleteQuery = "DELETE FROM `rooms` WHERE `r_number`=?";
//        
//        try {
//            
//            st = my_connection.prepareStatement(deleteQuery);
//
//            st.setInt(1, roomNumber);
//            
//            return (st.executeUpdate() > 0);
//             
//           } 
//           catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
      // create a function to display all rooms in jtable
//    public void fillRoomsJTable(JTable table)
//    {
//        PreparedStatement ps;
//        ResultSet rs;
//        String selectQuery = "SELECT * FROM `rooms`";
//        
//        try {
//            
//            ps = my_connection.prepareStatement(selectQuery);
//            
//            rs = ps.executeQuery();
//            
//            DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
//            
//            Object[] row;
//            
//            while(rs.next())
//            {
//               row = new Object[4];
//               row[0] = rs.getInt(1);
//               row[1] = rs.getInt(2);
//               row[2] = rs.getString(3);
//               row[3] = rs.getString(4);
//               
//               tableModel.addRow(row);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
    // create a function to set a room to reserved or not
     public boolean setRoomToReserved(int number, String isReserved)
    {
        PreparedStatement st;
        String editQuery = "UPDATE `rooms` SET `reserved`=? WHERE `r_number`=?";
        
        try {
            
            st = my_connection.prepareStatement(editQuery);
            
            st.setString(1, isReserved);
            st.setInt(2, number);
            
            return (st.executeUpdate() > 0);
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
   // create a function to check if a room is already reserved
     public String isRoomReserved(int number)
    {
        PreparedStatement st;
        ResultSet rs;
        String editQuery = "SELECT `reserved` FROM `rooms` WHERE `r_number`=?";
        
        try {
            
            st = my_connection.prepareStatement(editQuery);
            
            st.setInt(1, number);
            
            rs = st.executeQuery();
            
            if(rs.next())
            {
                return rs.getString(1);
            }
            
            else{
                return "";
            }
             
           } 
           catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }

  
}
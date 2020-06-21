
package domain;

import MyfirstForm.MY_CONNECTION;
import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import javax.mail.Message;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Date;

/**
 *
 * @author atakl
 */
public class Reservation {
     Connection my_connection = MY_CONNECTION.createConnection();
    
    private int id;
    private int clientId;
    private int roomNo;
    private Date dateIn;
    private Date dateOut;

    public Reservation( int clientId, int roomNo, Date dateIn, Date dateOut) {
        
        this.clientId = clientId;
        this.roomNo = roomNo;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public Reservation(int id, int clientId, int roomNo, Date dateIn, Date dateOut) {
        this.id = id;
        this.clientId = clientId;
        this.roomNo = roomNo;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
    }

    public Connection getMy_connection() {
        return my_connection;
    }

    public void setMy_connection(Connection my_connection) {
        this.my_connection = my_connection;
    }

    
    
    public int getClientId() {
        return clientId;
    }

    public int getId() {
        return id;
    }
   
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    public Reservation() {
    }

    public void setId(int id) {
        this.id = id;
    }
}  
    
    // in the reservation table we need to add two FOREIGN keys:
    // 1 for the client
    // -> alter TABLE reservations ADD CONSTRAINT fk_client_id FOREIGN KEY (client_id) REFERENCES clients(id) on DELETE CASCADE
    // 2 for the room
    // -> alter TABLE reservations ADD CONSTRAINT fk_room_number FOREIGN KEY (room_number) REFERENCES rooms(r_number) on DELETE CASCADE
    // and add another foreign key between table types and rooms
    // -> alter TABLE rooms ADD CONSTRAINT fk_type_id FOREIGN KEY (type) REFERENCES type(id) on DELETE CASCADE
    
    
    // some fixes we need to do
    // 1 - when we add a new reservation the room associated with it should be set to reserved = YES
    //     and when deleting the reservation it should be set to reserved = NO
    // 2 - when we add a new reservation we need to check if the room is already reserved
    // 3 - check if the date_in > the current date
    // 4 - check if the date_out > the date in
    
    
//    Connection my_connection = MY_CONNECTION.createConnection();
//    Rooms room = new Rooms();
//       User user = new User();
//       Customer customer = new Customer();
     // create a function to add a new room
//    public boolean addReservation(int client_id, int room_number, String dateIn, String dateOut)
//    {
//        
//        PreparedStatement st;
//        String addQuery = "INSERT INTO `reservation`(`Client_id`, `Room_number`, `date_in`, `date_out`) VALUES (?,?,?,?)";
//        
//        try {
//            
//            st = my_connection.prepareStatement(addQuery);
//            
//            st.setInt(1, client_id);
//            st.setInt(2, room_number);
//            st.setString(3, dateIn);
//            st.setString(4, dateOut);
//            
//            if(room.isRoomReserved(room_number).equals("No"))
//            {
//              if (st.executeUpdate() > 0)
//                {
//                    room.setRoomToReserved(room_number, "Yes");
//                    return true;
//                }
//              else{
//                    return false;
//                  }    
//            }else{
//                JOptionPane.showMessageDialog(null, "This Room Is Already Reserved", "Room Reserved", JOptionPane.WARNING_MESSAGE);
//                return false;
//            }
//            
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }

    /**
     *
     * @param recepient
     */
//    public static void sendmail(String recepient){
//            Properties properties = new Properties();
//            properties.put("mail.smpt.auth", "true");
//            properties.put("mail.smtp.startls enable", "true");
//            properties.put("mail.smtp.host","smtp.gmail.com");
//            properties.put("mail.smtp.port", "587");
//            
//            String myAccountEmail = "atewayhaile@gmail.com";
//            String password = " ";//customer.getDes();
//            
//            Session session;
//        session = Session.getInstance(properties, new javax.mail.Authenticator() {
//            
//            
//            protected PasswordAuthentication getAuthentication(){    //PasswordAuthentication getPasswordAuthentication(){
//                return new PasswordAuthentication(myAccountEmail, password);
//            
//            }
//        });
//        }
//    //  private static Message propereMessage(Session session, String myAccountEmail, String recepient){
//            try{
//                MimeMessage message = new MimeMessage(session);
//                message.setForm(new InternetAddress(myAccountEmail));
//                message.setRecipient(Massage.reccipientType.TO, new InternetAddress(recpient));
//                message.setSubject("my first Email from java App");
//                message.setText("My there, \n look my mail");
//            }catch (Exception ex){
//                Logger.getLogger(JavaMailutil.class.getName()).log(Level.SEVERE), null, ex);
//          }
//        return null;
//
//            }
//        } 
//    }
   
    
    // create a function to edit the selected room
//    public boolean editReservation(int reservation_id,int client_id, int room_number, String dateIn, String dateOut)
//    {
//        PreparedStatement st;
//        String editQuery = "UPDATE `reservation` SET `client_id`=?,`room_number`=?,`date_in`=?,`date_out`=? WHERE `id`=?";
//        
//        try {
//            
//            st = my_connection.prepareStatement(editQuery);
//            
//            st.setInt(1, client_id);
//            st.setInt(2, room_number);
//            st.setString(3, dateIn);
//            st.setString(4, dateOut);
//            st.setInt(5, reservation_id);
//            
//            return (st.executeUpdate() > 0);
//             
//           } 
//           catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
    
    
    
     // create a function to remove the selected reservation
//    public boolean removeReservation(int reservation_id)
//    {
//        PreparedStatement st;
//        String deleteQuery = "DELETE FROM `reservation` WHERE `id`=?";
//        
//        try {
//            
//            st = my_connection.prepareStatement(deleteQuery);
//
//            st.setInt(1, reservation_id);
//            
//            // we need to get the room number before delting the reservation
//            int room_number = getRoomNumberFromReservation(reservation_id);
//            
//            if (st.executeUpdate() > 0)
//            {
//                room.setRoomToReserved(room_number, "No");
//                return true;
//                
//            }else{
//                
//                return false;
//            }
//             
//           } 
//           catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return false;
//        }
//    }
    
    
     // create a function to display all rooms in jtable
//    public void fillReservationsJTable(JTable table)
//    {
//        PreparedStatement ps;
//        ResultSet rs;
//        String selectQuery = "SELECT * FROM `reservation`";
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
//               row = new Object[5];
//               row[0] = rs.getInt(1);
//               row[1] = rs.getInt(2);
//               row[2] = rs.getInt(3);
//               row[3] = rs.getString(4);
//               row[4] = rs.getString(5);
//               
//               tableModel.addRow(row);
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//        } 
//    }
   
    
    // create a function to get the room number from a reservation
//    public int getRoomNumberFromReservation(int reservationID)
//    {
//        PreparedStatement ps;
//        ResultSet rs;
//        String selectQuery = "SELECT `room_number` FROM `reservation` WHERE `id` = ?";
//        
//        try {
//            
//            ps = my_connection.prepareStatement(selectQuery);
//            
//            ps.setInt(1, reservationID);
//            
//            rs = ps.executeQuery();
//            
//            if(rs.next()) 
//            {
//                return rs.getInt(1);
//            }
//            else{
//                return 0;
//            }
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
//            return 0;
//        } 
//    }
//
//    public void setId(int aInt) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
//}

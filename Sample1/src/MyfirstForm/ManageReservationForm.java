/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyfirstForm;
import controllers.ReservationController;
import domain.Customer;
import domain.Reservation;
import domain.User;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author atakl
 */
public class ManageReservationForm extends javax.swing.JFrame {
 
    User user = new User();
    ReservationController controller = new ReservationController();
    Reservation reservation = new Reservation();
    
    public ManageReservationForm() {
         initComponents();
        
       // reservation.fillReservationsJTable(JTable);
        populateTable(JTable);
        JTable.setRowHeight(25);
         
    }   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        reservation_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clientid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        roomno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        addnewreservation = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        clearfield = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        datein = new com.toedter.calendar.JDateChooser();
        dateout = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manage Reservation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(267, 267, 267)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID:");

        reservation_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Client ID:");

        clientid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Room No.:");

        roomno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Date In:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Date Out:");

        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservatioon_ID", "Client Id", "Room No", "Date In.", "Date out"
            }
        )
        {public boolean isCellEditable(int row, int column)
            {
                return false;
            }
        }
    );
    JTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            JTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(JTable);

    addnewreservation.setBackground(new java.awt.Color(255, 255, 0));
    addnewreservation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    addnewreservation.setText("Add New Reservation");
    addnewreservation.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addnewreservationActionPerformed(evt);
        }
    });

    edit.setBackground(new java.awt.Color(255, 255, 0));
    edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    edit.setForeground(new java.awt.Color(51, 51, 51));
    edit.setText("Edit");
    edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    edit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            editActionPerformed(evt);
        }
    });

    remove.setBackground(new java.awt.Color(255, 255, 0));
    remove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    remove.setText("Remove");
    remove.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeActionPerformed(evt);
        }
    });

    clearfield.setBackground(new java.awt.Color(255, 0, 0));
    clearfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    clearfield.setText("Clear Fields");
    clearfield.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            clearfieldActionPerformed(evt);
        }
    });

    refresh.setBackground(new java.awt.Color(255, 255, 255));
    refresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    refresh.setText("Refresh");
    refresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshActionPerformed(evt);
        }
    });

    datein.setDateFormatString("dd/MM/yyyy");

    dateout.setDateFormatString("dd/MM/yyyy");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(addnewreservation)
                            .addGap(79, 79, 79)
                            .addComponent(edit)
                            .addGap(101, 101, 101)
                            .addComponent(remove))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(datein, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(reservation_id, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clientid, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(82, 82, 82)
                                    .addComponent(clearfield, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(74, 74, 74)))
                    .addGap(44, 44, 44)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 599, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(795, 795, 795)
            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(reservation_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(clientid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(datein, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(81, 81, 81)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addnewreservation)
                        .addComponent(edit)
                        .addComponent(remove))
                    .addGap(31, 31, 31)
                    .addComponent(clearfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(11, 11, 11)
            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(63, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
         // display the selected row data in the jtextfields
            
            // get the jtabel model
            DefaultTableModel model = (DefaultTableModel)JTable.getModel();
            
            // get the selected row index
            int rIndex = JTable.getSelectedRow();
            
            // display data
            reservation_id.setText(model.getValueAt(rIndex, 0).toString());
            clientid.setText(model.getValueAt(rIndex, 1).toString());
            roomno.setText(model.getValueAt(rIndex, 2).toString());
             
            // display the dateIN & dateOUT from jtable to jdatechooser
            try {
                
                Date dateIn = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
                datein.setDate(dateIn);
                
                Date dateOut = new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
              dateout.setDate(dateOut);
                
        } catch (ParseException ex) {
            Logger.getLogger(ManageReservationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_JTableMouseClicked

    private void addnewreservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewreservationActionPerformed
        
        
        try{
               
               int client_id = Integer.valueOf(clientid.getText());
               int room_number = Integer.valueOf(roomno.getText());
               SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
               String date_in = dateFormat.format(datein.getDate());
               String date_out = dateFormat.format(dateout.getDate());
               String toDayDate = dateFormat.format(new Date());
               
               Date din = dateFormat.parse(date_in);
               Date dout = dateFormat.parse(date_out);
               Date tdd  = dateFormat.parse(toDayDate);
           
               
               // if the date_in is before or not equal to today date
               if(!(din.after(tdd) || din.equals(tdd)))
               {
               
                  JOptionPane.showMessageDialog(rootPane, "The Date In Must Be After Or Equal To Today Date", "Date IN Error", JOptionPane.ERROR_MESSAGE);
               
               }
               
               // if the date_out is before date_in or not equal to date_in
               else if(!(dout.after(din) || dout.equals(din)))
                   {
                     JOptionPane.showMessageDialog(rootPane, "The Date Out Must Be After Or Equal To Date IN", "Date OUT Error", JOptionPane.ERROR_MESSAGE);
                   }
               // if everything is ok
               else{
                  // if(reservation.addReservation(client_id,room_number,date_in,date_out))
                  if (!(client_id == 0)) {
                   reservation = controller.addReservaton(client_id, room_number, din, dout);
                     populateTable(JTable);
                    
                        JOptionPane.showMessageDialog(rootPane, "New Reservation Added Successfully", "Add Reservation", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Reservation NOT Added", "Add Reservation Error", JOptionPane.ERROR_MESSAGE);
                    }
                   
               }
                }
     
           catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Room number + Client ID", "Input Fields Error", JOptionPane.ERROR_MESSAGE);
            } 
            catch (ParseException ex) {
            Logger.getLogger(ManageReservationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
         
        
    }//GEN-LAST:event_addnewreservationActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // get data from the fields
            try{
                int reservationId = Integer.valueOf(reservation_id.getText());
                int roomNumber = Integer.valueOf(roomno.getText());
                int clientId = Integer.valueOf(clientid.getText());
                
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String date_in = dateFormat.format(datein.getDate());
                String date_out = dateFormat.format(dateout.getDate());
                
               String toDayDate = dateFormat.format(new Date());
               
               Date din = dateFormat.parse(date_in);
               Date dout = dateFormat.parse(date_out);
               Date tdd  = dateFormat.parse(toDayDate);
                
                // if the date_in is before or not equal to today date
               if(!(din.after(tdd) || din.equals(tdd)))
               {
               
                  JOptionPane.showMessageDialog(rootPane, "The Date In Must Be After Or Equal To Today Date", "Date IN Error", JOptionPane.ERROR_MESSAGE);
               
               }
               
               // if the date_out is before date_in or not equal to date_in
               else if(!(dout.after(din) || dout.equals(din)))
                   {
                     JOptionPane.showMessageDialog(rootPane, "The Date Out Must Be After Or Equal To Date IN", "Date OUT Error", JOptionPane.ERROR_MESSAGE);
                   }
               // if everything is ok
               else{
                   if(!(roomNumber==0)){
                    controller.updateReservation(reservationId,clientId, roomNumber, din, dout);
                    populateTable(JTable);
                    
                        JOptionPane.showMessageDialog(rootPane, "Reservation Information Updated Successfully", "Edit Reservation", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(rootPane, "Reservation Information Not Updated", "Edit Reservation Error", JOptionPane.ERROR_MESSAGE);
                    }
               }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Room number + The Client ID + Reservation ID", "Data Error", JOptionPane.ERROR_MESSAGE);
            }
            catch(NullPointerException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Select The Date IN & OUT", "Date Error", JOptionPane.ERROR_MESSAGE);
            }
            catch (ParseException ex) {
            Logger.getLogger(ManageReservationForm.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_editActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // delete the selected client
        try{
         int reservationId = Integer.valueOf(reservation_id.getText());
//                
//                if(controller.removeReservation(reservationId))
//                 {
                if (!(reservation_id.getText() == "")) {
                controller.removeReservation(reservationId);
                populateTable(JTable);
                      JOptionPane.showMessageDialog(rootPane, "Reservation Deleted Successfully", "Remove Reservation", JOptionPane.INFORMATION_MESSAGE);
                 }
            
             else{
            
                 JOptionPane.showMessageDialog(rootPane, "Reservation Not Deleted", "Remove Reservation Error", JOptionPane.ERROR_MESSAGE);
                }
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Reservation ID", "Reservation ID Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_removeActionPerformed

    private void clearfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearfieldActionPerformed
        clientid.setText("");
        reservation_id.setText("");
        roomno.setText("");
        
        // remove date from jdatechooser
        // if you want to set the date to the current day use new Date instead of null
        datein.setDate(null);
        dateout.setDate(null);
    }//GEN-LAST:event_clearfieldActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
//      // clear the jtable first
        JTable.setModel(new DefaultTableModel(null, new Object[]{"Reservation ID", "Client ID", "Room Number", "Date IN", "Date OUT"}));
//
//        // populate the jtable
//        reservation.fillReservationsJTable(JTable);
       populateTable(JTable);

    }//GEN-LAST:event_refreshActionPerformed
private void populateTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
        model.setRowCount(0);
        try {

            List<Reservation> reservation = controller.loadReservation();

            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

            reservation.forEach(reservation1 -> {
                Object[] row = new Object[5];
                row[0] = reservation1.getId();
                row[1] = reservation1.getClientId();
                row[2] = reservation1.getRoomNo();
                row[3] = reservation1.getDateIn();
                row[4] = reservation1.getDateOut();
                

                tableModel.addRow(row);
            });

        } catch (Exception ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ManageReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManageReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManageReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManageReservationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageReservationForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton addnewreservation;
    private javax.swing.JButton clearfield;
    private javax.swing.JTextField clientid;
    private com.toedter.calendar.JDateChooser datein;
    private com.toedter.calendar.JDateChooser dateout;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton remove;
    private javax.swing.JTextField reservation_id;
    private javax.swing.JTextField roomno;
    // End of variables declaration//GEN-END:variables

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyfirstForm;

import controllers.RoomController;
import domain.Customer;
import domain.Rooms;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author atakl
 */
public class ManageRoomForm extends javax.swing.JFrame {

    RoomController controller = new RoomController();
    Rooms room = new Rooms();
    All_Rooms_Type roomtype = new All_Rooms_Type();

    public ManageRoomForm() {
        initComponents();
        //display room-type in combobox
        List<Integer> typeList = controller.loadTypes();
            for (Integer i : typeList) {
            type.addItem(i.toString());
        }
//        room.fillRooms_TYPE_JCombobox(type);

        populateTable(JTable);
//        roomtype.populateTable(JTable);
        //show all table in JTable
//        room.fillRoomsJTable(JTable);
        JTable.setRowHeight(40);

        //create button group for the radioButton
        ButtonGroup bg = new ButtonGroup();
        bg.add(yes);
        bg.add(no);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        addnewroom = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        clearfield = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        type = new javax.swing.JComboBox<>();
        showtype = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        yes = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Manage Rooms");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1074, Short.MAX_VALUE))
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
        jLabel2.setText("Room No.");

        number.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Type");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Room Phone");

        phone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        JTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RoomNumber", "Type", "Phone", "Reserved"
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

    addnewroom.setBackground(new java.awt.Color(255, 255, 0));
    addnewroom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    addnewroom.setText("Add New Room");
    addnewroom.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addnewroomActionPerformed(evt);
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

    type.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    type.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            typeActionPerformed(evt);
        }
    });

    showtype.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    showtype.setText("Show Type");
    showtype.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            showtypeActionPerformed(evt);
        }
    });

    jLabel5.setBackground(new java.awt.Color(255, 255, 255));
    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel5.setText("Reserved");

    yes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    yes.setForeground(new java.awt.Color(51, 204, 0));
    yes.setText("YES");
    yes.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            yesActionPerformed(evt);
        }
    });

    no.setBackground(new java.awt.Color(255, 255, 255));
    no.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    no.setText("NO");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(yes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34)
            .addComponent(no)
            .addContainerGap(47, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(yes)
                .addComponent(no))
            .addGap(0, 4, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(addnewroom)
                                    .addGap(79, 79, 79)
                                    .addComponent(edit)
                                    .addGap(68, 68, 68)
                                    .addComponent(remove))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(showtype))
                                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(clearfield, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(49, 49, 49)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(318, 318, 318)
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap())
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
                        .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showtype))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(110, 110, 110)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addnewroom)
                        .addComponent(edit)
                        .addComponent(remove)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(clearfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 52, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();

        // get the selected row index
        int rIndex = JTable.getSelectedRow();

        // display data
        number.setText(model.getValueAt(rIndex, 0).toString());
        type.setSelectedItem(model.getValueAt(rIndex, 1));
        phone.setText(model.getValueAt(rIndex, 2).toString());

        String isReeserved = model.getValueAt(rIndex, 3).toString();

        if (isReeserved.equals("Yes")) {
            yes.setSelected(true);
        } else if (isReeserved.equals("No")) {
            no.setSelected(true);
        }

    }//GEN-LAST:event_JTableMouseClicked

    private void addnewroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewroomActionPerformed
        try {

            int roomNumber = Integer.valueOf(number.getText());
            int roomType = Integer.valueOf(type.getSelectedItem().toString());
            String noOfNumber = phone.getText();

            if (!(roomNumber == 0)) {
                room = controller.addRoom(roomNumber, roomType, noOfNumber);
                populateTable(JTable);

                JOptionPane.showMessageDialog(rootPane, "New Room Added Successfully", "Add Room", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Room NOT Added", "Add Room Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Room number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_addnewroomActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed

        int roomNumber = 0;
        int type1 = Integer.valueOf(type.getSelectedItem().toString());
        String phone1 = phone.getText();
        String isReserved = "No";

        if (yes.isSelected()) {
            isReserved = "Yes";
        }

        if (phone1.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter The Room Phone Number", "Empty Fields", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                roomNumber = Integer.valueOf(number.getText());
                Rooms room = controller.updateRoom(roomNumber, type1, phone1, isReserved);

                controller.loadRoom();
                populateTable(JTable);
                JOptionPane.showMessageDialog(rootPane, "Room updated successfuly", "Update Room", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Room not updated", "Update Room error", JOptionPane.ERROR_MESSAGE);
            }

//            try {
//                roomNumber = Integer.valueOf(number.getText());
//
//                if (room.editRoom(roomNumber, type1, phone1, isReserved)) {
//                    JOptionPane.showMessageDialog(rootPane, "Room Data Updated Successfully", "Edit Room", JOptionPane.INFORMATION_MESSAGE);
//                } else {
//
//                    JOptionPane.showMessageDialog(rootPane, "Room Data Not Updated", "Edit Room Error", JOptionPane.ERROR_MESSAGE);
//                }
//
//            } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter The Room number", "Room Number Error", JOptionPane.ERROR_MESSAGE);
//            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // delete the selected client
        int id1 = (Integer) JTable.getValueAt(JTable.getSelectedRow(), 0);
        try {
            
                controller.removeRoom(id1);
                populateTable(JTable);

                //  if (room.removeRoom(id1)) {
                JOptionPane.showMessageDialog(rootPane, "Client Deleted Successfully", "Remove Client", JOptionPane.INFORMATION_MESSAGE);
          

                
         

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, "Client Not Deleted", "Remove Client Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void clearfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearfieldActionPerformed
        // remove text from all jtextfields
        number.setText("");
        phone.setText("");
        type.setSelectedIndex(0);
        no.setSelected(true);

    }//GEN-LAST:event_clearfieldActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // clear the jtable first
        JTable.setModel(new DefaultTableModel(null, new Object[]{"Number", "Type", "Phone", "Reserved"}));
//        // populate the jtable
//        room.fillRoomsJTable(JTable);
        populateTable(JTable);

    }//GEN-LAST:event_refreshActionPerformed

    private void showtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showtypeActionPerformed
        All_Rooms_Type roomTypeForm = new All_Rooms_Type();
        roomTypeForm.setVisible(true);
        roomTypeForm.pack();
        roomTypeForm.setLocationRelativeTo(null);
        roomTypeForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        controller.loadRoomType();

    }//GEN-LAST:event_showtypeActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed
    private void populateTable(JTable table) {
        DefaultTableModel model = (DefaultTableModel) JTable.getModel();
        model.setRowCount(0);
        //  JTable.setModel(new DefaultTableModel(null, new Object[]{"Number","Type","Phone","Reserved"}));
        try {

            List<Rooms> rooms = controller.loadRoom();

            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

            rooms.forEach(room -> {
                Object[] row = new Object[5];
                row[0] = room.getRoomNo();
                row[1] = room.getType();
                row[2] = room.getNoOfRooms();
                row[3] = room.getReserved();

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
//            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ManageRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ManageRoomForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JButton addnewroom;
    private javax.swing.JButton clearfield;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField number;
    private javax.swing.JTextField phone;
    private javax.swing.JButton refresh;
    private javax.swing.JButton remove;
    private javax.swing.JButton showtype;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JRadioButton yes;
    // End of variables declaration//GEN-END:variables
}

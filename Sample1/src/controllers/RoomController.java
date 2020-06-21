/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.RoomDAO;
import DAO.RoomDAOImpl;
import domain.All_Rooms;
import domain.Rooms;
import java.util.List;

/**
 *
 * @author atakl
 */
public class RoomController {

    private RoomDAO roomDao = new RoomDAOImpl();
    private All_Rooms room = new All_Rooms();

    public Rooms addRoom(int roomNo, int type, String noOfRooms) {
        // create Room Object and pass to DAO

        Rooms room = new Rooms(roomNo, type, noOfRooms);
        //get data from Room dao

        room = roomDao.addRoom(room);

        return room;
    }

    public List<Rooms> loadRoom() {
        // load all Rooms using DAO
        List<Rooms> room = roomDao.loadRoom();
        return room;
    }

    public List<All_Rooms> loadRoomType() {
        List<All_Rooms> room = roomDao.roomType();

        return room;
    }
    public List<Integer> loadTypes(){
        return roomDao.loadTypes();
    }
     public Rooms updateRoom(int roomNumber, int type1, String phone1, String isReserved){
        
        // edit Room Object and pass to DAO

        Rooms room = new Rooms(roomNumber, type1, phone1, isReserved);

        //get data from customer dao

         roomDao.editRoom(room);
       
        return room;
        
     
    }  
     public void removeRoom(int id){
        
      

        boolean customer = roomDao.removeRoom(id);

        //return customer;
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import domain.All_Rooms;
import domain.Rooms;
import java.util.List;

/**
 *
 * @author atakl
 */
public interface RoomDAO {

   
       Rooms addRoom(Rooms room);
       List<Rooms> loadRoom();
       List<All_Rooms> roomType();
       List<Integer> loadTypes();
       boolean editRoom(Rooms room);
       boolean removeRoom(int id);
    
}

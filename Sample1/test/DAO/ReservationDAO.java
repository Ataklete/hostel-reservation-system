/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import domain.Reservation;
import java.util.List;

/**
 *
 * @author atakl
 */
public interface ReservationDAO {
    Reservation addReservation(Reservation reserv);
    boolean removeReservation(int reservation_id);
    public List<Reservation> loadreservation();
    boolean editReservation(Reservation reservattion);
}

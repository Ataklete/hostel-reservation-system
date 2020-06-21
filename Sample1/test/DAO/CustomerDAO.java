/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import domain.Customer;
import java.util.List;

/**
 *
 * @author atakl
 */
public interface CustomerDAO  {
    Customer addClient(Customer customer);
    boolean editClient(Customer customer);
    boolean removeClient(int customer);
    Customer refreshClient(Customer customer);
    List<Customer> loadCustomers();
}

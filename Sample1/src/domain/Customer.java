package domain;

import MyfirstForm.MY_CONNECTION;
import java.sql.Connection;

public class Customer {

    Connection my_connection = MY_CONNECTION.createConnection();

    private int id;
    private String firstName;
    private String LastName;
    private String phone;
    private String des;

    public Customer() {
    }

    public Customer(String firstName, String LastName, String phone, String des) {
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.des = des;
    }

    public Customer(int id, String firstName, String LastName, String phone, String des) {
        this.id = id;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.des = des;
    }

    public Customer(int id) {
        
    }

    public Customer(int roomNumber, int type1, String phone1, String reserved) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public Connection getMy_connection() {
        return my_connection;
    }

    public void setMy_connection(Connection my_connection) {
        this.my_connection = my_connection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

  

}

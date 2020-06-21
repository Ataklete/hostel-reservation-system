/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import MyfirstForm.All_Rooms_Type;
import javax.swing.JFrame;

/**
 *
 * @author atakl
 */
public class All_Rooms {
    private int typeNumber;
    private String typeName;
    private int price;

    public All_Rooms(int typeNumber, String typeName, int price) {
        this.typeNumber = typeNumber;
        this.typeName = typeName;
        this.price = price;
    }

    public All_Rooms() {
        
    }

    public int getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(int typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.Serializable;

/**
 *
 * @author Rafid Bapi
 */

//implements Serializable
public class item implements Serializable {
    String name;
    int id;
    int price;
    String Catagory;

    public item(String name, int id, int price, String Catagory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.Catagory = Catagory;
    }

    item(String text, int parseInt, int parseInt0, String text0, String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String Catagory) {
        this.Catagory = Catagory;
    }
    
    
    
    
    
}



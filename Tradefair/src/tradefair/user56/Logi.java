/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

/**
 *
 * @author WALTON
 */
import java.io.Serializable;


//implements Serializable
public class Logi implements Serializable {
    String name;
    int id;
    int price;
    String Catagory;
    String Supplier;

    public Logi(String name, int id, int price, String Catagory,  String Supplier) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.Catagory = Catagory;
        this.Supplier = Supplier;
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
    
    public String getSupplier() {
        return Supplier;
    }
    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }
    
    
    
    
    
}




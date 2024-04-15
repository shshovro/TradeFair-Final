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
public class Pay implements Serializable {
    String name;
    String id;
    String price;
    String Catagory;
    

    public Pay (String name, String id, String price, String Catagory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.Catagory = Catagory;
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String Catagory) {
        this.Catagory = Catagory;
    }

    
   
    
    
    
    
    
}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.Serializable;

/**
 * @author WALTON
 */
public class blast implements Serializable {

    int id;
    String details;
   

    public blast(int id, String customerUsername, String name, float ammount) {
        this.id = id;
        this.details = details;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getdetails() {
        return details;
    }

    public void setdetails(String customerUsername) {
        this.details = customerUsername;
    }

 

    @Override
    public String toString() {
        return "blast{" + "id=" + id + ", details=" + details+ '}';
    }

    public String writable() {
        return "id=" + id + "<> details=" + details + "\n";

    }

}

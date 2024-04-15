/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.Serializable;

/**
 *
 * @author WALTON
 */
public class Balance implements Serializable {
    
    String id;
    String details;
    String action;

    public Balance(String id, String details, String action) {
        this.id = id;
        this.details = details;
        this.action = action;
    }

  


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}

   

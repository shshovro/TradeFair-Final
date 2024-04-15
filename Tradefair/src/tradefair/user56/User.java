/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected String username;
    protected String password;
    protected String usertype;

    public User(String name, String username, String password, String usertype) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    
    public boolean isUsername(String a) {
        if (a.equalsIgnoreCase(this.username))  // a == user
            return true;
        else
            return false;
    }

    public boolean isPassword(String a) {
        if (a.equalsIgnoreCase(this.password))
            return true;
        else
            return false;
    }

    public boolean isUsertype(String a) {
        if (a.equalsIgnoreCase(this.usertype))
            return true;
        else
            return false;
    }
    
    
}

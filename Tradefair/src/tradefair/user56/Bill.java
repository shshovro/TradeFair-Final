/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.time.LocalDate;
import java.time.Period;
import javafx.beans.property.SimpleStringProperty;


 public class Bill {
       private SimpleStringProperty firstName, lastName,id,salary,gender;
    private LocalDate birthday;
    
    

    public Bill(String firstName, String lastName, LocalDate birthday,String id,String salary,String gender) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
         this.id = new SimpleStringProperty(id);
          this.salary = new SimpleStringProperty(salary);
          this.gender = new SimpleStringProperty(gender);
        this.birthday = birthday;
    }

    Bill(String sadman, String hafiz, LocalDate of) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Bill(String text, String text0, LocalDate value, String text1, String text2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFirstName(String firstName) {
        this.firstName = new SimpleStringProperty(firstName);
    }

    public void setlastName(String lastName) {
        this.lastName= new SimpleStringProperty(lastName);
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    
    
    public String getFirstName() {
        //return firstName;
        return firstName.get();
    }

    public String getLastName() {
        return lastName.get();
    }

    public LocalDate getBirthday() {
        return birthday;
        
                
    }

    public String getId() {
        return id.get();
    }

    public void setId(String id) {
        this.id= new SimpleStringProperty(id);
    }

    public String getSalary() {
        return salary.get();
    }

    public void setSalary(String salary) {
        this.salary= new SimpleStringProperty(salary);
    }
      public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
         this.gender= new SimpleStringProperty(gender);
    }

  
    
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

/**
 *
 * @author aftab
 */
public class executive extends staff {
    
    String gender;
    String age;

    public executive(String gender, String age, String staffName, int staffId, String staffPost) {
        super(staffName, staffId, staffPost);
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

   

    
}

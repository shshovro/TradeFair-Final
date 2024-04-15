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
public class staff {
    String staffName;
    int staffId;
    String staffPost;

    public staff(String staffName, int staffId, String staffPost) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.staffPost = staffPost;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }

    public String getStaffPost() {
        return staffPost;
    }

    public void setStaffPost(String staffPost) {
        this.staffPost = staffPost;
    }

    
    
}

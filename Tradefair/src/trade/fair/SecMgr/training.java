/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair.SecMgr;

/**
 *
 * @author aftab
 */
public class training {
    
     int traineeid;
     String trainingdescription;
     String status;
     String shift;

    public training(int traineeid, String trainingdescription, String status, String shift) {
        this.traineeid = traineeid;
        this.trainingdescription = trainingdescription;
        this.status = status;
        this.shift = shift;
    }

    public int getTraineeid() {
        return traineeid;
    }

    public void setTraineeid(int traineeid) {
        this.traineeid = traineeid;
    }

    public String getTrainingdescription() {
        return trainingdescription;
    }

    public void setTrainingdescription(String trainingdescription) {
        this.trainingdescription = trainingdescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
    
    
}

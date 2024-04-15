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
public class boothskeletion {
    int boothNo;
    String boothLocation;
    String boothSize;

    public boothskeletion(int boothNo, String boothLocation, String boothSize) {
        this.boothNo = boothNo;
        this.boothLocation = boothLocation;
        this.boothSize = boothSize;
    }

    public int getBoothNo() {
        return boothNo;
    }

    public void setBoothNo(int boothNo) {
        this.boothNo = boothNo;
    }

    public String getBoothLocation() {
        return boothLocation;
    }

    public void setBoothLocation(String boothLocation) {
        this.boothLocation = boothLocation;
    }

    public String getBoothSize() {
        return boothSize;
    }

    public void setBoothSize(String boothSize) {
        this.boothSize = boothSize;
    }

   
    
}

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
class events {
     String eventtitle;
    int eventtagno;
    int logtime;
    String eventdescription;

    public events(String eventtitle, int eventtagno, int logtime, String eventdescription) {
        this.eventtitle = eventtitle;
        this.eventtagno = eventtagno;
        this.logtime = logtime;
        this.eventdescription = eventdescription;
    }

    public String getEventtitle() {
        return eventtitle;
    }

    public void setEventtitle(String eventtitle) {
        this.eventtitle = eventtitle;
    }

    public int getEventtagno() {
        return eventtagno;
    }

    public void setEventtagno(int eventtagno) {
        this.eventtagno = eventtagno;
    }

    public int getLogtime() {
        return logtime;
    }

    public void setLogtime(int logtime) {
        this.logtime = logtime;
    }

    public String getEventdescription() {
        return eventdescription;
    }

    public void setEventdescription(String eventdescription) {
        this.eventdescription = eventdescription;
    }
    
    
}

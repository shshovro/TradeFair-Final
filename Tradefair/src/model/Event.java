package model;

import java.io.Serializable;
import java.time.LocalDateTime; 
 
public class Event implements Serializable {

    private String eventName;
    private String eventDateTime;
    private String eventRoom;
    
    // Constructor with all fields
    public Event(String eventName, String eventDateTime, String eventRoom) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
        this.eventRoom = eventRoom;
    }
    
    // Getters and setters
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getEventRoom() {
        return eventRoom;
    }

    public void setEventRoom(String eventRoom) {
        this.eventRoom = eventRoom;
    }
}

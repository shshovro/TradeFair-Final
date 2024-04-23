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
public class ticket {
    
    int ticketSl;
    String ticketType;
    int ticketprice;

    public ticket(int ticketSl, String ticketType, int ticketprice) {
        this.ticketSl = ticketSl;
        this.ticketType = ticketType;
        this.ticketprice = ticketprice;
    }

    public int getTicketSl() {
        return ticketSl;
    }

    public void setTicketSl(int ticketSl) {
        this.ticketSl = ticketSl;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public int getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(int ticketprice) {
        this.ticketprice = ticketprice;
    }
    
    
}

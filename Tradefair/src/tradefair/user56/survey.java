/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

/**
 *
 * @author WALTON
 */
import java.time.LocalDate;


public class survey {
    String name,report;
    String amount;
    LocalDate oder_date;

    public survey(String name, String report, String amount, LocalDate oder_date) {
        this.name = name;
        this.report = report;
        this.amount = amount;
        this.oder_date = oder_date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

   

    public LocalDate getOder_date() {
        return oder_date;
    }

    public void setOder_date(LocalDate oder_date) {
        this.oder_date = oder_date;
    }
    
    
}
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
/**
 *
 * @author WALTON
 */
public class survey {
   
    String name,report;
    int amount;
    LocalDate oder_date;

    public survey(String name, String report, int amount, LocalDate oder_date) {
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getOder_date() {
        return oder_date;
    }

    public void setOder_date(LocalDate oder_date) {
        this.oder_date = oder_date;
    }
    
}

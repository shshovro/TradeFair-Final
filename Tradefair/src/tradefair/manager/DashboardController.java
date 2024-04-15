/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.manager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class DashboardController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eminfo(ActionEvent event)throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/EmployeeInformatio.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 

    }

    @FXML
    private void financial(ActionEvent event)throws IOException{
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/FinancialReport.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    @FXML
    private void ticket(ActionEvent event)throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/Ticket.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }


    @FXML
    private void sponsor(ActionEvent event)throws IOException{
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/SponsorDetails.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void schedule(ActionEvent event)throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/Schedule.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void entrySchedule(ActionEvent event)throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/EntryShedule.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    
    }

    @FXML
    private void transaction(ActionEvent event)throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/TransactionApproval.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void security(ActionEvent event)throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/Security.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void newEmployee(ActionEvent event)throws IOException {
        
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/HiringEmployee.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void back(ActionEvent event) throws IOException{ 
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("manager/Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }
    
}
 
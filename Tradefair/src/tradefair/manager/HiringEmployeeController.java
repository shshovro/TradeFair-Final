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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class HiringEmployeeController implements Initializable {

    @FXML
    private TextField Name;
    @FXML
    private TextField contact;
    @FXML
    private TextField email;
    @FXML
    private TableView<?> newemtable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void position(ActionEvent event) {
    }

    @FXML
    private void university(ActionEvent event) {
    }

    @FXML
    private void salary(ActionEvent event) {
    }

    @FXML
    private void experiene(ActionEvent event) {
    }

    @FXML
    private void department(ActionEvent event) {
    }

    @FXML
    private void viewNem(ActionEvent event) {
    }

    @FXML
    private void submit(ActionEvent event) {
    }

    @FXML
    private void cv(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 

    }
    
}

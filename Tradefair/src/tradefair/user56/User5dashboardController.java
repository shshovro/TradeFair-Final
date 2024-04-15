/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User5dashboardController implements Initializable {

    @FXML
    private Label welcome;
    @FXML
    private Label welcome1;
    @FXML
    private Label welcome2;
    @FXML
    private TextArea notificationTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void wf1(ActionEvent event)throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal1_a_Paymentlist.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 

    @FXML
    private void wf2(ActionEvent event) {
    }

    @FXML
    private void wf3(ActionEvent event) {
    }

    @FXML
    private void wf4(ActionEvent event) {
    }

    @FXML
    private void wf5(ActionEvent event) {
    }

    @FXML
    private void wf6(ActionEvent event) {
    }

    @FXML
    private void wf7(ActionEvent event) {
    }

    @FXML
    private void wf8(ActionEvent event) {
    }

    @FXML
    private void signoutbutton(ActionEvent event) {
    }
    
}

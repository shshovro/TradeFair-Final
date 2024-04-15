/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.abid;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazia
 */
public class EventDetailsController implements Initializable {

    @FXML
    private TableView<?> overview;
    @FXML
    private TableColumn<?, ?> viewpurpose;
    @FXML
    private TableColumn<?, ?> viewtheme;
    @FXML
    private TableColumn<?, ?> viewscope;
    @FXML
    private TableColumn<?, ?> viewopeningtime;
    @FXML
    private TableColumn<?, ?> viewclosingtime;
    @FXML
    private TableColumn<?, ?> viewlocation;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void purpose(ActionEvent event) {
    }

    @FXML
    private void theme(ActionEvent event) {
    }

    @FXML
    private void scope(ActionEvent event) {
    }

    @FXML
    private void openingtime(ActionEvent event) {
    }

    @FXML
    private void closingtime(ActionEvent event) {
    }

    @FXML
    private void location(ActionEvent event) {
    }

    @FXML
    private void backtodashboard(ActionEvent event) throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Exhibitor Dashbord.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 

    }
    
}

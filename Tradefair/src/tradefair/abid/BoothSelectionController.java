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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kazia
 */
public class BoothSelectionController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ComboBox<?> boothsize;
    @FXML
    private ComboBox<?> boothtype;
    @FXML
    private TableView<?> selectedboothreview;
    @FXML
    private TableColumn<?, ?> viewboothtype;
    @FXML
    private TableColumn<?, ?> boothlocation;
    @FXML
    private TableColumn<?, ?> viewboothsize;
    @FXML
    private TableColumn<?, ?> amenities;
    @FXML
    private TableColumn<?, ?> pricing;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void review(ActionEvent event) {
    }

    @FXML
    private void confirmboothselection(ActionEvent event) {
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

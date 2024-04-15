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
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import trade.fair.RegBoothController;
import tradefair.abid.BoothSelectionController;


/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User6_goal2_a_BoothassignmentController implements Initializable {

    @FXML
    private BorderPane BorderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewreg(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/trade/fair/RegBooth.fxml"));
        Parent root = loader.load();
        RegBoothController controller = loader.getController();
         // Replace with actual values
        BorderPane.setCenter(root);
    }

    @FXML
    private void viewboothselections(ActionEvent event)throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/tradefair/abid/Booth Selection.fxml"));
        Parent root = loader.load();
        BoothSelectionController controller = loader.getController();
         // Replace with actual values
        BorderPane.setCenter(root);
    }

    @FXML
    private void staff(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("user6_goal7_a_Stafflistview.fxml"));
        Parent root = loader.load();
        User6_goal7_a_StafflistviewController controller = loader.getController();
         // Replace with actual values
        BorderPane.setCenter(root);
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user6dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        }
    
}

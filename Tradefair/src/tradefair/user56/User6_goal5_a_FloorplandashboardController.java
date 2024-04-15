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

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User6_goal5_a_FloorplandashboardController implements Initializable {
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
    private void backButtonOnClick(ActionEvent event)throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user6dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 

    @FXML
    private void ViewProductsBtn(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("user6_goal5_a_Floorplanview.fxml"));
        Parent root = loader.load();
        User6_goal5_a_FloorplanviewController controller = loader.getController();
         // Replace with actual values
        BorderPane.setCenter(root);
    }

    @FXML
    private void AddNewProductBtn(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("user6_goal5_a_Floorplanadding.fxml"));
        Parent root = loader.load();
        User6_goal5_a_FloorplanaddingController controller = loader.getController();
         // Replace with actual values
        BorderPane.setCenter(root); 
        } 
    
}


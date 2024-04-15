/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User5_goal4_a_ChartsController implements Initializable {

    @FXML
    private PieChart PieChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ObservableList<PieChart.Data> pieChartData =
FXCollections.observableArrayList(
new PieChart. Data ("Electricity Cost", 35000),
new PieChart. Data ("Transportation Cost", 65000),
new PieChart. Data ("Employee Cost", 100000),
new PieChart. Data ("TAX", 45000),
new PieChart. Data ("Inventory Cost", 20000));
        
        PieChart.setData(pieChartData);
        PieChart.setTitle("Expanses evaluation");
        
        // TODO
    }    

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("User5 dashboard manual.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 
    
}

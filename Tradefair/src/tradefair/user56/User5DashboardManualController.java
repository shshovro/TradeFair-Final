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
public class User5DashboardManualController implements Initializable {

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
    private void wf2(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal2_a_Plannings.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 

    @FXML
    private void wf3(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal3_a_balancesheet.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 

    
    @FXML
    private void wf4(ActionEvent event)  throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal4_a_Charts.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 
    
    
    @FXML
    private void wf5(ActionEvent event) {
    }

    @FXML
    private void wf6(ActionEvent event)  throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal6_a_Taxdashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 
 //user5_goal6_a_Taxdashboard
    @FXML
    private void wf7(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal7_a_Offersdashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 

    @FXML
    private void wf8(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("user5_goal8_a_Paymentsummary.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 

    @FXML
    private void signoutbutton(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("FXMLLoginPage.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

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
 * @author aftab
 */
public class RegMgrController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void CheckIn(ActionEvent event) throws Exception{
     Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("CheckIn.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   
        
        
    }

    @FXML
    private void boothReg(ActionEvent event) throws Exception {
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("RegBooth.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }



    @FXML
    private void regulation(ActionEvent event) throws Exception {
            Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Regulations.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void reporting(ActionEvent event) throws Exception {
    Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Reporting.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void ticketing(ActionEvent event) throws Exception {
    Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Ticketing.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void notification(ActionEvent event) throws Exception {
    Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("Notifications.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void userSupport(ActionEvent event) throws Exception {
    Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("UserSupport.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void staffRegistration(ActionEvent event) throws Exception {
        Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("RegStaff.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show(); 
    }

    @FXML
    private void RegMgrLogoutB(ActionEvent event) throws Exception {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/tradefair/user56/FXMLLoginPage.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
        
    }
    
}

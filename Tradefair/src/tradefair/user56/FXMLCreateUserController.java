/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 */
public class FXMLCreateUserController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private ComboBox<String> type;
    
     ObservableList<String> list1 = FXCollections.observableArrayList("Manager","Programme Coordinator", "Finanace Supervisor","Director of Operation", "Exhibitor", "Attendee", "Registrattion Manager","Security Manager");

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        type.setItems(list1);
    }    

    @FXML
    private void create(ActionEvent event) throws IOException{
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("user.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
              
            
            User i = new  User(
                    name.getText(),
                    username.getText(),
                    password.getText(),
                    type.getValue());
            

            
                
             oos.writeObject(i);
             
            name.clear();
            username.clear();
            password.clear();
           
            
            
        } catch (IOException ex) {
            Logger.getLogger(FXMLSellerAddItemController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(FXMLSellerAddItemController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }

    @FXML
    private void logOut(ActionEvent event) throws Exception{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLLoginPage.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User5_goal1_bController implements Initializable {

   @FXML
    private TextField itemName;
    @FXML
    private TextField itemId;
    @FXML
    private TextField itemPrice;
    @FXML
    private ComboBox<String> catagory;

    ObservableList<String> list1 = FXCollections.observableArrayList("Paid","Unpaid");
   
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        catagory.setItems(list1);
    }    

    @FXML
    private void submitItem(ActionEvent event) throws IOException{
        
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("pay.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            Pay i = new Pay(
                    itemName.getText(),
                    itemId.getText(),
                   itemPrice.getText(),
                    catagory.getValue());
                   
            
//catagory.getValue
            
                
             oos.writeObject(i);
             
            itemName.clear();
            itemId.clear();
            itemPrice.clear();
        
            
            
        } catch (IOException ex) {
            Logger.getLogger(User5_goal1_bController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(User5_goal1_bController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
        
    }
    
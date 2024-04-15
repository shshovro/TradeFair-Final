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
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User6_goal7_a_StaffaddingController implements Initializable {

    @FXML
    private TextField itemName;
    @FXML
    private TextField itemId;
    @FXML
    private TextField itemPrice;
    @FXML
    private ComboBox<String> catagory;
    @FXML
    private ComboBox<String> supplire;
    
    ObservableList<String> list1 = FXCollections.observableArrayList("Stuff","Volunteer");
    
    ObservableList<String> list2 = FXCollections.observableArrayList("Front","Center", "Back");
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        catagory.setItems(list1);
        supplire.setItems(list2);
    }    

    @FXML
    private void submitItem(ActionEvent event) throws IOException{
        
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("stuff.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            Stuff i = new Stuff(
                    itemName.getText(),
                    Integer.parseInt(itemId.getText()),
                    Integer.parseInt(itemPrice.getText()),
                    catagory.getValue(),
                    supplire.getValue());
            
//catagory.getValue
            
                
             oos.writeObject(i);
             
            itemName.clear();
            itemId.clear();
            itemPrice.clear();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(User6_goal7_a_StaffaddingController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(User6_goal7_a_StaffaddingController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
        
    }
    


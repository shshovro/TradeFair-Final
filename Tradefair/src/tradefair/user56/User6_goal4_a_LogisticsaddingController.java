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
public class User6_goal4_a_LogisticsaddingController implements Initializable {

    @FXML
    private TextField itemName;
    @FXML
    private TextField itemId;
    @FXML
    private TextField itemPrice;
    @FXML
    private ComboBox<String> catagory;
    @FXML
    private TextField supplire;
    
    ObservableList<String> list1 = FXCollections.observableArrayList("Paid","Unpaid");
    

    /**
     * Initializes the controller class.
     */
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
          
            f = new File("logi.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            Logi i = new Logi(
                    itemName.getText(),
                    Integer.parseInt(itemId.getText()),
                    Integer.parseInt(itemPrice.getText()),
                    catagory.getValue(),
                    supplire.getText());
            
//catagory.getValue
            
                
             oos.writeObject(i);
             
            itemName.clear();
            itemId.clear();
            itemPrice.clear();
            supplire.clear();
            
            
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
        
    }
    


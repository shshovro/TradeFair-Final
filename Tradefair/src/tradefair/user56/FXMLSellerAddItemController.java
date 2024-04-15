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
 
 */
public class FXMLSellerAddItemController implements Initializable {

    @FXML
    private TextField itemName;
    @FXML
    private TextField itemId;
    @FXML
    private TextField itemPrice;
    @FXML
    private ComboBox<String> catagory;

    ObservableList<String> list1 = FXCollections.observableArrayList("Vegetable", "Junk Food","Cold Food");
    @FXML
    private TextArea viewItemBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        catagory.setItems(list1);
    }    

    @FXML
    private void submitItem(ActionEvent event) throws IOException{
        
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("item.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            item i = new item(
                    itemName.getText(),
                    Integer.parseInt(itemId.getText()),
                    Integer.parseInt(itemPrice.getText()),
                    catagory.getValue());
            

            
                
             oos.writeObject(i);
             
            itemName.clear();
            itemId.clear();
            itemPrice.clear();
            
            
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
    private void backtothedashboard(ActionEvent event) throws Exception {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("user556/FXMLsellerDashBoard.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void ViewItem(ActionEvent event)throws Exception {
        viewItemBox.clear();
        ObjectInputStream ois=null;
        try {
           item s;
           ois = new ObjectInputStream(new FileInputStream("item.bin"));
           while(true){
           s = (item) ois.readObject();
           String r = s.getName()+
                     ","+s.getId()+
                     ","+s.getPrice()+
                    ","+s.getCatagory()+
                    "\n";
           viewItemBox.appendText(r);
           }
           
       } catch (Exception ex) {
           try {
               if(ois!=null)
                   ois.close();
           } 
           catch (IOException e) {
               e.printStackTrace();
           }
           ex.printStackTrace();
       } 

    }
    
}

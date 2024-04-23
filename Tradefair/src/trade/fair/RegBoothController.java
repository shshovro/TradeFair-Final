/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tradefair.user56.Stuff;
import tradefair.user56.User6_goal7_a_StaffaddingController;

/**
 * FXML Controller class
 *
 * @author CITS_2
 */
public class RegBoothController implements Initializable {

    @FXML
    private ComboBox<String> boothSizeCombo;
    private TextField boothNoTfield;
    @FXML
    private TextField boothLocTfield;
    @FXML
    private TableView<boothskeletion> boothTableview;
    @FXML
    private TableColumn<boothskeletion, String> boothNoCol;
    @FXML
    private TableColumn<boothskeletion, String> boothSizeCol;
    @FXML
    private TableColumn<boothskeletion, String> boothLocCol;

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField BoothNoTfield;
    
    ObservableList<String> bthlist = FXCollections.observableArrayList("s","m", "l","xl");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       boothSizeCombo.setItems(bthlist);
         boothNoCol.setCellValueFactory (new PropertyValueFactory<boothskeletion,String>("boothNo"));
        boothLocCol.setCellValueFactory (new PropertyValueFactory<boothskeletion,String>("boothLocation"));
        boothSizeCol.setCellValueFactory (new PropertyValueFactory<boothskeletion,String>("boothSize"));
          loadboothskeletionFile();
    }    
//int boothNo, String boothLocation, String boothSize
    @FXML
    private void boothSubmitB (ActionEvent event) throws IOException {
        
        
        if(!boothLocTfield.getText().isEmpty() || !boothNoTfield.getText().isEmpty() || !boothSizeCombo.getValue().isEmpty()){
            boothskeletion newData = new boothskeletion(Integer.parseInt(boothNoTfield.getText()),boothLocTfield.getText(),  boothSizeCombo.getValue());
            boothTableview.getItems().add(newData);
           // boothNoTfield.clear();
            //boothLocTfield.clear();
            
            
        }else{
            System.out.println("Fields should not be empty.");
        }
       
        
         File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("boothskeletion.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new trade.fair.AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            boothskeletion b = new boothskeletion(
                  
                    
             Integer.parseInt(boothNoTfield.getText()),
                    boothLocTfield.getText(),  
                    boothSizeCombo.getValue()        
            );
//catagory.getValue
            
                
             oos.writeObject(b);
             
            boothNoTfield.clear();
            boothLocTfield.clear();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(RegBoothController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(RegBoothController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
        
    }

    @FXML
    private void RegHomeB(ActionEvent event) throws Exception{
     Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("/trade/fair/RegMgr.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   
    }

    private void loadboothskeletionFile() {
    
        ObjectInputStream ois=null;
         try {
            boothskeletion b;
            ois = new ObjectInputStream(new FileInputStream("boothskeletion.bin"));
            while(true){
            b = (boothskeletion) ois.readObject();
            boothTableview.getItems().add(b);
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
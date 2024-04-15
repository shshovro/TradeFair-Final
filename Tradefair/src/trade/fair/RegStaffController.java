/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import tradefair.user56.AppendableObjectOutputStream;
import tradefair.user56.FXMLSellerAddItemController;
import tradefair.user56.User;

/**
 * FXML Controller class
 *
 * @author CITS_2
 */
public class RegStaffController implements Initializable {

    @FXML
    private TableView<staff> staffTableview;
    @FXML
    private TableColumn<staff, String> staffIdCol;
    @FXML
    private TableColumn<staff, String> staffnameCol;
    @FXML
    private TableColumn<staff, String> staffPosCol;
    @FXML
    private TextField staffNameTfield;
    @FXML
    private TextField staffIdTfield;
    @FXML
    private ComboBox<String> staffPostCombo;
    @FXML
    private Button staffRegSubmitB;
    
    ArrayList<staff>staffList;
    @FXML
    private Button viewstaffButton;

    /**
     * Initializes the controller class.
     */
    ObservableList<String> stlist = FXCollections.observableArrayList("Executive","Volunteer", "Guard","Media");

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /*staffPostCombo.getItems().add("Executive");
        staffPostCombo.getItems().add("Volunteer");
        staffPostCombo.getItems().add("Guard");
        staffPostCombo.getItems().add("Media");
        */
        staffPostCombo.setItems(stlist);
        
        staffList = new ArrayList<staff>();
        
        staffIdCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffId"));
        staffnameCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffName"));
        staffPosCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffPost"));
        
    }    
//String staffName, int staffId
    @FXML
    private void regstaffsubmit(ActionEvent event) {
        
       /*0 staffList.add(new staff (
                staffNameTfield.getText(),
                Integer.parseInt(staffIdTfield.getText()),
                staffPostCombo.getValue()
            )
        ) ;*/
       
       
       File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("staff.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
              
            
            staff i = new  staff(
                    staffNameTfield.getText(),
                    Integer.parseInt(staffIdTfield.getText()),
                    staffPostCombo.getValue());
            

            
                
             oos.writeObject(i);
             
            staffNameTfield.clear();staffIdTfield.clear(); 
           
            
            
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
    private void RegHomeB(ActionEvent event) throws Exception{
     Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("/trade/fair/RegMgr.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   
    }

    @FXML
    private void viewstaffB(ActionEvent event) {
        for (staff s: staffList)
        {
        staffTableview.getItems().add(s);
        }
    }
    
}

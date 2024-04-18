/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

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
    
   
    /**
     * Initializes the controller class.
     */
    ObservableList<String> stlist = FXCollections.observableArrayList("Executive","Volunteer", "Guard","Media");

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        staffPostCombo.setItems(stlist);
         staffIdCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffId"));
        staffnameCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffName"));
        staffPosCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffPost"));
          loadstaffFile();
        
        
        
       
        
    }    
//String staffName, int staffId
    @FXML
    private void regstaffsubmit(ActionEvent event) throws IOException{
        
         if(!staffNameTfield.getText().isEmpty() || !staffIdTfield.getText().isEmpty() || !staffPostCombo.getValue().isEmpty()){
            staff newData = new staff(staffNameTfield.getText(), Integer.parseInt(staffIdTfield.getText()), staffPostCombo.getValue());
            staffTableview.getItems().add(newData);
            staffNameTfield.clear();
            staffIdTfield.clear();
            
        }else{
            System.out.println("Fields should not be empty.");
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
    private void loadstaffFile() {
    
         ObjectInputStream ois=null;
         try {
            staff s;
            ois = new ObjectInputStream(new FileInputStream("staff.bin"));
            while(true){
            s = (staff) ois.readObject();
            staffTableview.getItems().add(s);
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
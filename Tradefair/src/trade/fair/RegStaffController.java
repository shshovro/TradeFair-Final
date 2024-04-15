/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
    
    ArrayList<staff>staffList;
    @FXML
    private Button viewstaffButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        staffPostCombo.getItems().add("Executive");
        staffPostCombo.getItems().add("Volunteer");
        staffPostCombo.getItems().add("Guard");
        staffPostCombo.getItems().add("Media");
        
        staffList = new ArrayList<staff>();
        
        staffIdCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffId"));
        staffnameCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffName"));
        staffPosCol.setCellValueFactory (new PropertyValueFactory<staff,String>("staffPost"));
        
    }    
//String staffName, int staffId
    @FXML
    private void regstaffsubmit(ActionEvent event) {
        
        staffList.add(new staff (
                staffNameTfield.getText(),
                Integer.parseInt(staffIdTfield.getText()),
                staffPostCombo.getValue()
            )
        ) ;
        staffNameTfield.clear();staffIdTfield.clear(); 
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

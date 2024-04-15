/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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
    @FXML
    private TableColumn<boothskeletion,String> boothAssignCol;

    /**
     * Initializes the controller class.
     */
    ArrayList<boothskeletion>boothList;
    @FXML
    private TextField BoothNoTfield;
    
    ObservableList<String> bthlist = FXCollections.observableArrayList("s","m", "l","xl");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
      /* boothSizeCombo.getItems().add("s");
        boothSizeCombo.getItems().add("m");
        boothSizeCombo.getItems().add("l");
        boothSizeCombo.getItems().add("xl");
        */
        boothList = new ArrayList<boothskeletion>();
         boothSizeCombo.setItems(bthlist);
    }    

    @FXML
    private void boothSubmitB(ActionEvent event) {
        
        boothList.add(new boothskeletion (
                Integer.parseInt(boothNoTfield.getText()),
                boothLocTfield.getText(),
                boothSizeCombo.getValue()
            )
        ) ;
        boothLocTfield.clear();boothNoTfield.clear(); 
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
    private void viewBoothList(ActionEvent event) {
    }
    
}

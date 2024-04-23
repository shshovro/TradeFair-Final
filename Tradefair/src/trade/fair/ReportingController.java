/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.net.URL;
import java.util.ResourceBundle;
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
 * @author aftab
 */
public class ReportingController implements Initializable {

    @FXML
    private TableView<?> reporttable;
    @FXML
    private TableColumn<?, ?> buyernamecol;
    @FXML
    private TableColumn<?, ?> tickettypecol;
    @FXML
    private TableColumn<?, ?> ticektnocol;
    @FXML
    private TextField buyernameTfield;
    @FXML
    private TextField ticketnoTfield;
    @FXML
    private ComboBox<?> tickettypecombo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void RegHomeB(ActionEvent event)throws Exception{
     Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("/trade/fair/RegMgr.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   
    }

    @FXML
    private void addbuyerB(ActionEvent event) {
    }
    
}

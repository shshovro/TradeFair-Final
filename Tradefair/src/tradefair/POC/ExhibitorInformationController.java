/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.POC;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class ExhibitorInformationController implements Initializable {

    @FXML
    private TableView<?> exhibitorInfoTable;
    @FXML
    private TableColumn<?, ?> exhibitorNameCol;
    @FXML
    private TableColumn<?, ?> exhibitorNumberCol;
    @FXML
    private TableColumn<?, ?> exhibitorDateCol;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void back(ActionEvent event) {
    }
    
}

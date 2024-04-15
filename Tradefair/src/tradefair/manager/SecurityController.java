/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.manager;

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
public class SecurityController implements Initializable {

    @FXML
    private TableView<?> securityTableView;
    @FXML
    private TableColumn<?, ?> eventTittleCol;
    @FXML
    private TableColumn<?, ?> eventTagCol;
    @FXML
    private TableColumn<?, ?> entryTimeCol;

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
    private void confirm(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event) {
    }
    
}

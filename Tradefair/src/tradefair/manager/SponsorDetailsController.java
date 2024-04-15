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
import javafx.scene.control.TreeTableColumn;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class SponsorDetailsController implements Initializable {

    @FXML
    private TreeTableColumn<?, ?> nameCol;
    @FXML
    private TreeTableColumn<?, ?> comNameCol;
    @FXML
    private TreeTableColumn<?, ?> updatCol;
    @FXML
    private TreeTableColumn<?, ?> contactCol;
    @FXML
    private TreeTableColumn<?, ?> remarksCol1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void confirm(ActionEvent event) {
    }

    @FXML
    private void pdf(ActionEvent event) {
    }
    
}

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
public class ScheduleController implements Initializable {

    @FXML
    private TableView<?> scheduleTableview;
    @FXML
    private TableColumn<?, ?> eventCol;
    @FXML
    private TableColumn<?, ?> roomNoCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Next(ActionEvent event) {
    }

    @FXML
    private void noOfevent(ActionEvent event) {
    }

    @FXML
    private void date(ActionEvent event) {
    }

    @FXML
    private void roomNo(ActionEvent event) {
    }

    @FXML
    private void dateCol(TableColumn.CellEditEvent<S, T> event) {
    }

    @FXML
    private void timeCol(TableColumn.CellEditEvent<S, T> event) {
    }

    @FXML
    private void submit(ActionEvent event) {
    }
    
}

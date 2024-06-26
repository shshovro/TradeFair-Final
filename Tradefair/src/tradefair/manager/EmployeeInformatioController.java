/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.manager;

import java.io.IOException;
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
 * @author Asus
 */
public class EmployeeInformatioController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField contact;
    @FXML
    private TextField id;
    @FXML
    private ComboBox<?> designation;
    @FXML
    private TextField salary;
    @FXML
    private TableView<?> employeeinfotable;
    @FXML
    private TableColumn<?, ?> nameCol;
    @FXML
    private TableColumn<?, ?> idCol;
    @FXML
    private TableColumn<?, ?> contactCol;
    @FXML
    private TableColumn<?, ?> designationCol;
    @FXML
    private TableColumn<?, ?> genderCol;
    @FXML
    private TableColumn<?, ?> salaryCol;
    @FXML
    private TableColumn<?, ?> statusCol;
    @FXML
    private TableColumn<?, ?> remarkCol;
    @FXML
    private TextField remark;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void maleB(ActionEvent event) {
    }

    @FXML
    private void femaleB(ActionEvent event) {
    }

    @FXML
    private void submit(ActionEvent event) {
    }

    @FXML
    private void viewinfo(ActionEvent event) {
    }

    @FXML
    private void status(ActionEvent event) {
    }

    @FXML
    private void back(ActionEvent event)throws IOException {
        
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 

    }
    
}

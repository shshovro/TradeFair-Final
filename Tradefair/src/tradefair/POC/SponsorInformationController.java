/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.POC;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Sponsor;
import tradefair.user56.AppendableObjectOutputStream;

/**
 * FXML Controller class
 *
 * @author IT
 */
public class SponsorInformationController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField compNameTextField;
    @FXML
    private TextField contactTextField;
    @FXML
    private TextArea remarksTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void viewInformationOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("/tradefair/manager/SponsorDetails.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void back(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("POC Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void submitOnClick(ActionEvent event) {
        if (nameTextField.getText() == null || nameTextField.getText().isEmpty()
                || compNameTextField.getText() == null || compNameTextField.getText().isEmpty()
                || contactTextField.getText() == null || contactTextField.getText().isEmpty()
                || remarksTextArea.getText() == null || remarksTextArea.getText().isEmpty()) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error");
            a.setHeaderText("Please Fill All The Information");
            a.show();
            return;
        }

        String name = nameTextField.getText();
        String compName = compNameTextField.getText();
        String contact = contactTextField.getText();
        String Remarks = remarksTextArea.getText();

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("Sponsors.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            Sponsor sponsorObj = new Sponsor(name, compName, contact, Remarks);
            oos.writeObject(sponsorObj);

            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setTitle("Confirmation Alert");
            a.setHeaderText("Sponsor Information Added");
            a.showAndWait();

        } catch (IOException ex) {
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException ex) {
            }
        }
    }

    @FXML
    private void dashboardOnClick(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("POC Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

}

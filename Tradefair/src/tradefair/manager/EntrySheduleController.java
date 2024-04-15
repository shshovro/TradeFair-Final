/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.manager;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Event;
import tradefair.user56.AppendableObjectOutputStream;

/**
 * FXML Controller class
 *
 * @author IT
 */
public class EntrySheduleController implements Initializable {

    @FXML
    private DatePicker eventDateDateTime;
    @FXML
    private TextField timeInHoursTextField;
    @FXML
    private TextField timeInMinsTextField;
    @FXML
    private ComboBox<String> roomNumberComboBox;
    @FXML
    private TextField eventNameTextField;
    @FXML
    private RadioButton amRB;
    @FXML
    private RadioButton pmRB;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        // Combo Box
        roomNumberComboBox.getItems().addAll("1", "2", "3", "4");
        roomNumberComboBox.getSelectionModel().selectFirst();

        //Radio Button
        ToggleGroup toggleGroup = new ToggleGroup();
        amRB.setToggleGroup(toggleGroup);
        pmRB.setToggleGroup(toggleGroup);

        amRB.setSelected(true);
    }

    @FXML
    private void backToDashboardOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

    @FXML
    private void submitOnClick(ActionEvent event) {
        
        
        if (eventNameTextField.getText().isEmpty() || eventNameTextField.getText() == null || timeInHoursTextField.getText().isEmpty() || timeInMinsTextField.getText().isEmpty() || eventDateDateTime.getValue() == null) {
            Alert a = new Alert(Alert.AlertType.ERROR);
            a.setTitle("Error");
            a.setHeaderText("Please Fill All The Information");
            a.show();
            return;
        }
        
        String eventName = eventNameTextField.getText();
        String eventRoom = roomNumberComboBox.getValue();

        int timeInHoursValue = Integer.parseInt(timeInHoursTextField.getText());
        int timeInMinsValue = Integer.parseInt(timeInMinsTextField.getText());
        LocalDate eventDateInLocalDate = eventDateDateTime.getValue();
        String eventDate = eventDateInLocalDate.toString();
        String period = (amRB.isSelected()) ? "AM" : "PM";

        String eventDateTime = eventDate + " " + timeInHoursValue + ":" + timeInMinsValue + " " + period;

        

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("Events.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            Event eventObj = new Event(eventName, eventDateTime, eventRoom);
            oos.writeObject(eventObj);

            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setTitle("Confirmation Alert");
            a.setHeaderText("Schedule Added");
            a.showAndWait();

            Parent scene2Parent = FXMLLoader.load(getClass().getResource("EventScheduleListView.fxml"));
            Scene scene2 = new Scene(scene2Parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene2);
            window.show();

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
    private void viewSchedulesOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("EventScheduleListView.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

}

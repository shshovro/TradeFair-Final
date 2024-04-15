/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.manager;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Event;

/**
 * FXML Controller class
 *
 * @author IT
 */
public class EventScheduleListViewController implements Initializable {

    @FXML
    private TableView<Event> meetingScheduleTableView;
    @FXML
    private TableColumn<Event, String> eventNameTableColumn;
    @FXML
    private TableColumn<Event, String> eventTimeTableColumn;
    @FXML
    private TableColumn<Event, String> roomNoEventColumn;

    private ObservableList<Event> getMeetingSchedule() {
        ObservableList<Event> eventList = FXCollections.observableArrayList();
        ObjectInputStream ois = null;
        try {
            Event eventObj;
            ois = new ObjectInputStream(new FileInputStream("Events.bin"));

            while (true) {
                eventObj = (Event) ois.readObject();
                eventList.add(eventObj);
            }

        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {

            }

            return eventList;
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eventNameTableColumn.setCellValueFactory(new PropertyValueFactory<Event, String>("eventName"));
        eventTimeTableColumn.setCellValueFactory(new PropertyValueFactory<Event, String>("eventDateTime"));
        roomNoEventColumn.setCellValueFactory(new PropertyValueFactory<Event, String>("eventRoom"));

        meetingScheduleTableView.setItems(getMeetingSchedule());
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("EntryShedule.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
        
    }

    @FXML
    private void dashboardOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();
    }

}

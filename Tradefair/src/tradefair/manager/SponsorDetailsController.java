/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.manager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import model.Sponsor;

/**
 * FXML Controller class
 *
 * @author IT
 */
public class SponsorDetailsController implements Initializable {

    @FXML
    private TableView<Sponsor> sponsorDetailsTableView;
    @FXML
    private TableColumn<Sponsor, String> nameCol;
    @FXML
    private TableColumn<Sponsor, String> comNameCol;
    @FXML
    private TableColumn<Sponsor, String> contactCol;
    @FXML
    private TableColumn<Sponsor, String> remarksCol;

    private ObservableList<Sponsor> getSponsorDetails() {
        ObservableList<Sponsor> sponsorList = FXCollections.observableArrayList();
        ObjectInputStream ois = null;
        try {
            Sponsor sponsorObj;
            ois = new ObjectInputStream(new FileInputStream("Sponsors.bin"));

            while (true) {
                sponsorObj = (Sponsor) ois.readObject();
                sponsorList.add(sponsorObj);
            }

        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {

            }

            return sponsorList;
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameCol.setCellValueFactory(new PropertyValueFactory<Sponsor, String>("name"));
        comNameCol.setCellValueFactory(new PropertyValueFactory<Sponsor, String>("companyName"));
        contactCol.setCellValueFactory(new PropertyValueFactory<Sponsor, String>("contact"));
        remarksCol.setCellValueFactory(new PropertyValueFactory<Sponsor, String>("remarks"));

        sponsorDetailsTableView.setItems(getSponsorDetails());
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show();

    }

    @FXML
    private void pdfOnClick(ActionEvent event) {
        
    }

}

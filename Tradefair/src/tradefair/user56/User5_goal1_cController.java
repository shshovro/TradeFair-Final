/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User5_goal1_cController implements Initializable {
 @FXML
    private TableView<Pay> itemViewer;
    @FXML
    private TableColumn<Pay, String> nameViewer;
    @FXML
    private TableColumn<Pay, String> idViewer;
    @FXML
    private TableColumn<Pay, String> priceViewer;
    @FXML
    private TableColumn<Pay, String> catagoryViewer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        setCellValueFactory(new PropertyValueFactory<meeting, String>("meetingId"));
          nameViewer.setCellValueFactory(new PropertyValueFactory<Pay, String>("name"));
          idViewer.setCellValueFactory(new PropertyValueFactory<Pay, String>("id"));
          priceViewer.setCellValueFactory(new PropertyValueFactory<Pay, String>("price"));
          catagoryViewer.setCellValueFactory(new PropertyValueFactory<Pay, String>("Catagory"));
          
          loadPayFile();
        // TODO
    } 
    
    private void loadPayFile() {
        ObjectInputStream ois=null;
         try {
            
             Pay s;
            ois = new ObjectInputStream(new FileInputStream("pay.bin"));
            while(true){
            s = (Pay) ois.readObject();
            itemViewer.getItems().add(s);
            }
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
        }        
    }

    @FXML
    private void deleteData(ActionEvent event) {
        TableView.TableViewSelectionModel<Pay> selectionModel = itemViewer.getSelectionModel();
        if(selectionModel.isEmpty()){
            System.out.println("You need select a data before deleting.");
        }

        ObservableList<Integer> list = selectionModel.getSelectedIndices();
        Integer[] selectedIndices = new Integer[list.size()];
        selectedIndices = list.toArray(selectedIndices);

        Arrays.sort(selectedIndices);

        for(int i = selectedIndices.length - 1; i >= 0; i--){
            selectionModel.clearSelection(selectedIndices[i].intValue());
            itemViewer.getItems().remove(selectedIndices[i].intValue());
        }
    }
    
}


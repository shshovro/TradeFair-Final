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
import java.util.ResourceBundle;
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
public class User6_goal5_a_FloorplanviewController implements Initializable {

    @FXML
    private TableView<Floor> itemViewer;
    @FXML
    private TableColumn<Floor, String> nameViewer;
    @FXML
    private TableColumn<Floor, String> idViewer;
    @FXML
    private TableColumn<Floor, String> priceViewer;
    @FXML
    private TableColumn<Floor, String>catagoryViewer;
    @FXML
    private TableColumn<Floor, String> catagoryViewer1;

    /**
     * Initializes the controller class.
     */
   @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameViewer.setCellValueFactory(new PropertyValueFactory<Floor, String> ("name"));
          idViewer.setCellValueFactory(new PropertyValueFactory<Floor, String> ("id"));
          priceViewer.setCellValueFactory(new PropertyValueFactory<Floor, String> ("price"));
          catagoryViewer.setCellValueFactory(new PropertyValueFactory<Floor, String> ("Catagory"));
          catagoryViewer1.setCellValueFactory(new PropertyValueFactory<Floor, String> ("Supplier"));
          loadFloorFile();
        // TODO
    }    
    private void loadFloorFile() {
        ObjectInputStream ois=null;
         try {
            Floor s;
            ois = new ObjectInputStream(new FileInputStream("floor.bin"));
            while(true){
            s = (Floor) ois.readObject();
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
    
    
}
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
public class User6_goal7_a_StafflistviewController implements Initializable {

   @FXML
    private TableView<Stuff> itemViewer;
    @FXML
    private TableColumn<Stuff, String> nameViewer;
    @FXML
    private TableColumn<Stuff, String> idViewer;
    @FXML
    private TableColumn<Stuff, String> priceViewer;
    @FXML
    private TableColumn<Stuff, String>catagoryViewer;
    @FXML
    private TableColumn<Stuff, String> catagoryViewer1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameViewer.setCellValueFactory(new PropertyValueFactory<Stuff, String>("name"));
          idViewer.setCellValueFactory(new PropertyValueFactory<Stuff, String>("id"));
          priceViewer.setCellValueFactory(new PropertyValueFactory<Stuff, String>("price"));
          catagoryViewer.setCellValueFactory(new PropertyValueFactory<Stuff, String>("Catagory"));
          catagoryViewer1.setCellValueFactory(new PropertyValueFactory<Stuff, String>("Supplier"));
          loadStuffFile();
        // TODO
    }    
    private void loadStuffFile() {
        ObjectInputStream ois=null;
         try {
            Stuff s;
            ois = new ObjectInputStream(new FileInputStream("stuff.bin"));
            while(true){
            s = (Stuff) ois.readObject();
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

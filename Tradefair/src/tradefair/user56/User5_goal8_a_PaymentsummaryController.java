/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User5_goal8_a_PaymentsummaryController implements Initializable {

    @FXML
    private ComboBox<String> catagory;
    @FXML
    private TableView<Salary> itemViewer;
    @FXML
    private TableColumn<Salary, String> nameViewer;
    @FXML
    private TableColumn<Salary, String> idViewer;
    @FXML
    private TableColumn<Salary, String> priceViewer;
    @FXML
    private TableColumn<Salary, String> catagoryViewer;
    @FXML
    private TableColumn<Salary, String> catagoryViewer1;
    @FXML
    private ComboBox<String> supplire;
    @FXML
    private TextField itemName;
    @FXML
    private TextField itemId;
    @FXML
    private TextField itemPrice;
    
     ObservableList<String> list1 = FXCollections.observableArrayList("Applicable","Not applicable");
    
    ObservableList<String> list2 = FXCollections.observableArrayList("Manager","Finance", "Stuff", "Administration", "Operation", "Marketing","Volunteer","Staff");
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        catagory.setItems(list1);
        supplire.setItems(list2);
        
         nameViewer.setCellValueFactory(new PropertyValueFactory<Salary, String>("name"));
          idViewer.setCellValueFactory(new PropertyValueFactory<Salary, String>("id"));
          priceViewer.setCellValueFactory(new PropertyValueFactory<Salary, String>("price"));
          catagoryViewer.setCellValueFactory(new PropertyValueFactory<Salary, String>("Catagory"));
          catagoryViewer1.setCellValueFactory(new PropertyValueFactory<Salary, String>("Supplier"));
          loadSalaryFile();
        // TODO
    }    
     private void loadSalaryFile() {
        ObjectInputStream ois=null;
         try {
            Salary s;
            ois = new ObjectInputStream(new FileInputStream("salary.bin"));
            while(true){
            s = (Salary) ois.readObject();
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
    private void submitItem(ActionEvent event) throws IOException{
        
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("salary.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            
            Salary i = new Salary(
                    itemName.getText(),
                    itemId.getText(),
                    itemPrice.getText(),
                    catagory.getValue(),
                    supplire.getValue());
            
//catagory.getValue
            
                
             oos.writeObject(i);
             
            itemName.clear();
            itemId.clear();
            itemPrice.clear();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(User5_goal8_a_PaymentsummaryController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(User5_goal8_a_PaymentsummaryController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
    @FXML
    private void backButtonOnClick(ActionEvent event)  throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("User5 dashboard manual.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        } 
    
}

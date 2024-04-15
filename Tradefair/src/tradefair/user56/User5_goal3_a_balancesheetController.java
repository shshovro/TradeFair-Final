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
import java.util.Arrays;
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
public class User5_goal3_a_balancesheetController implements Initializable {

    @FXML
    private TableView<Balance> SponsoreTable;
    @FXML
    private TableColumn<Balance, String> idcol;
    @FXML
    private TableColumn<Balance, String> detailscol;
    @FXML
    private TableColumn<Balance, String> actionCol;
    @FXML
    private TextField tnxid;
    @FXML
    private TextField detialssupp;
    @FXML
    private ComboBox<String> paytype;
    
     ObservableList<String> list1 = FXCollections.observableArrayList("Bank","Bkash" ,"Nagad", "Rocket");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        paytype.setItems(list1);
        // TODO
        idcol.setCellValueFactory(new PropertyValueFactory<Balance, String>("id"));
        detailscol.setCellValueFactory(new PropertyValueFactory<Balance, String>("details"));
        actionCol.setCellValueFactory(new PropertyValueFactory<Balance, String>("action"));
        
         loadBalanceFile();
    }    
     private void loadBalanceFile() {
        ObjectInputStream ois=null;
         try {
            Balance s;
            ois = new ObjectInputStream(new FileInputStream("balance.bin"));
            while(true){
            s = (Balance) ois.readObject();
            SponsoreTable.getItems().add(s);
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
    private void addtnx(ActionEvent event)  throws IOException{
        
        File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("balance.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            Balance i = new Balance (
                    
                    idcol.getText(),
                    detailscol.getText(),
                    paytype.getValue());
            
//catagory.getValue
            
                
             oos.writeObject(i);
            tnxid.clear();
            detialssupp.clear();
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(User5_goal3_a_balancesheetController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(User5_goal3_a_balancesheetController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
    }
        

    @FXML
    private void homeb(ActionEvent event) throws IOException {
            
           Parent scene2Parent = FXMLLoader.load(getClass().getResource("User5 dashboard manual.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene2);
        window.show(); 
        }

    @FXML
    private void delettnxb(ActionEvent event) {
        TableView.TableViewSelectionModel<Balance> selectionModel = SponsoreTable.getSelectionModel();
        if(selectionModel.isEmpty()){
            System.out.println("You need select a data before deleting.");
        }

        ObservableList<Integer> list = selectionModel.getSelectedIndices();
        Integer[] selectedIndices = new Integer[list.size()];
        selectedIndices = list.toArray(selectedIndices);

        Arrays.sort(selectedIndices);

        for(int i = selectedIndices.length - 1; i >= 0; i--){
            selectionModel.clearSelection(selectedIndices[i].intValue());
           SponsoreTable.getItems().remove(selectedIndices[i].intValue());
        }
    }
    
}

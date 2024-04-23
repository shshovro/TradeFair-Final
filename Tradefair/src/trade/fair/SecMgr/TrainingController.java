/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair.SecMgr;

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
import trade.fair.RegBoothController;
import trade.fair.boothskeletion;
import trade.fair.staff;

/**
 * FXML Controller class
 *
 * @author aftab
 */
public class TrainingController implements Initializable {

    @FXML
    private TableView<training> trainingtable;
    @FXML
    private TableColumn<training, String> traineeidcol;
    @FXML
    private TableColumn<training, String> trainingdescriptioncol;
    @FXML
    private TableColumn<training, String> statuscol;
    @FXML
    private TableColumn<training, String> shiftcol;
    @FXML
    private TextField traineeidTfield;
    @FXML
    private TextField trainingdescriptionTield;
    @FXML
    private ComboBox<String> shiftcombo;
    @FXML
    private ComboBox<String> statuscombo;

    /**
     * Initializes the controller class.
     */
    
    ObservableList<String> status = FXCollections.observableArrayList("active","inactive");
    ObservableList<String> shift = FXCollections.observableArrayList("day","night");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //int traineeid, String trainingdescription, String status, String shift
        statuscombo.setItems(status);
        shiftcombo.setItems(shift);
         traineeidcol.setCellValueFactory (new PropertyValueFactory<training,String>("traineeidTfield"));
        trainingdescriptioncol.setCellValueFactory (new PropertyValueFactory<training,String>("trainingdescription"));
        statuscol.setCellValueFactory (new PropertyValueFactory<training,String>("status"));
         shiftcol.setCellValueFactory (new PropertyValueFactory<training,String>("shift"));
          loadtrainingFile();
        
    }    

    @FXML
    private void SecHomeB(ActionEvent event) throws Exception{
     Parent mainSceneParent;
        mainSceneParent = FXMLLoader.load(getClass().getResource("/trade/fair/SecMgr/SecMgr.fxml"));
        Scene scene1= new Scene (mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();   
    }

    @FXML
    private void addtrainingB(ActionEvent event) {
        
         if(!traineeidTfield.getText().isEmpty()
                 || !trainingdescriptionTield.getText().isEmpty() 
                 || !statuscombo.getValue().isEmpty()
                 ||!shiftcombo.getValue().isEmpty()){
            training newData = new training(Integer.parseInt(traineeidTfield.getText()),trainingdescriptionTield.getText(),  statuscombo.getValue(),  shiftcombo.getValue());
            trainingtable.getItems().add(newData);
           
            
        }else{
            System.out.println("Fields should not be empty.");
        }
       
        
         File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("training.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new trade.fair.AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            training b = new training(
                  
                    
             Integer.parseInt(traineeidTfield.getText()),
                    trainingdescriptionTield.getText(),  
                    statuscombo.getValue(),
                     shiftcombo.getValue()
            );
//catagory.getValue
            
                
             oos.writeObject(b);
             
            traineeidTfield.clear();
            trainingdescriptionTield.clear();
            
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(RegBoothController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
          try {
              if(oos != null) oos.close();
          } catch (IOException ex) {
              Logger.getLogger(RegBoothController.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
        
    }
    
     private void loadtrainingFile() {
    
         ObjectInputStream ois=null;
         try {
            training t;
            ois = new ObjectInputStream(new FileInputStream("training.bin"));
            while(true){
            t = (training) ois.readObject();
            trainingtable.getItems().add(t);
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
    

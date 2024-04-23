/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trade.fair;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author aftab
 */
public class SurveillenceController implements Initializable {

    @FXML
    private TextField eventtitle;
    @FXML
    private TextField eventlogtime;
    @FXML
    private TextField eventdescription;
    @FXML
    private TextField eventtagno;

    /**
     * Initializes the controller class.
     */
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
        /* boothNoCol.setCellValueFactory (new PropertyValueFactory<boothskeletion,String>("boothNo"));
        boothLocCol.setCellValueFactory (new PropertyValueFactory<boothskeletion,String>("boothLocation"));
        boothSizeCol.setCellValueFactory (new PropertyValueFactory<boothskeletion,String>("boothSize"));
          loadboothskeletionFile();*/
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
    private void addeventB(ActionEvent event) {
        //String eventtitle, int eventtagno, int logtime, String eventdescription
         if(!eventtitle.getText().isEmpty() 
                 || !eventtagno.getText().isEmpty() 
                 || !eventlogtime.getText().isEmpty()|| !eventdescription.getText().isEmpty()){
            //events newData = new events(eventtitle.getText(),Integer.parseInt(eventtagno.getText()),Integer.parseInt(eventlogtime.getText()),eventdescription.getText(), );
           // boothTableview.getItems().add(newData);
           // boothNoTfield.clear();
            //boothLocTfield.clear();
            
            
        }else{
            System.out.println("Fields should not be empty.");
        }
       
        
         File f = null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
          
            f = new File("events.bin");
            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new trade.fair.AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            

           
            
            
            events b = new events(
                  
                    eventtitle.getText(),
             Integer.parseInt(eventtagno.getText()),
                    Integer.parseInt(eventlogtime.getText()),
                    eventdescription.getText()  
                          
            );

            
                
             oos.writeObject(b);
             
            eventtitle.clear();
            eventtagno.clear();
            eventlogtime.clear();
                                eventdescription.clear();
            
            
            
            
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
    }
    


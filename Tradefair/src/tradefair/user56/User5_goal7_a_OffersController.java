/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User5_goal7_a_OffersController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField amountTextField;
    @FXML
    private DatePicker delivaryDateDatePicker;
    @FXML
    private DatePicker OderDateDatePicker;

    private ArrayList<project>pro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pro=new ArrayList<project>();
    }    
    

    @FXML
    private void nameTextFieldMouseButtonOnClick(MouseEvent event) {
        nameTextField.setText(null);
    }

    @FXML
    private void amountTextFieldmouseButtonOnClick(MouseEvent event) {
         amountTextField.setText(null);
    }

    @FXML
    private void svaeInformationButtonOnClick(ActionEvent event) {
         pro.add(
            new project(  nameTextField.getText(),
                                      Integer.parseInt(amountTextField.getText()),
                                      OderDateDatePicker.getValue(),
                                      delivaryDateDatePicker.getValue()
                                     
            )
                   
                   
             
                );
    }


    @FXML
    private void saveTxtFileButtonOnClick(ActionEvent event) {
        try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("ProjectList.txt");
                FileWriter fw;
                //FileWriter fw = new FileWriter(f);
                if(f.exists()) {
                    fw = new FileWriter(f,true);
                } else {
                    fw = new FileWriter(f);
                }
                String str="";
                str = pro.stream().map((s) -> s.getName()+" Offered at "+s.oder_date+" and it should be confimed/decline at "  
                        +s.delivery_date+" and the amount of the offer is "+s.getAmount()+"\n").reduce(str, String::concat); //str+= TableView.getItems();
              
                fw.write(str);
                fw.close();
            } catch (IOException ex) {
                
               
            }
    }

    
}

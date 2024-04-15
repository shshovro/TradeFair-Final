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
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User6_goal8_a_surveyaddingController implements Initializable {

    @FXML
    private TextField amountTextField;
    @FXML
    private DatePicker OderDateDatePicker;
    
    @FXML
    private TextField nameTextField;

    private ArrayList<survey>sur;
    @FXML
    private TextField report;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void saveTxtFileButtonOnClick(ActionEvent event) {
        try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("Survey.txt");
                FileWriter fw;
                //FileWriter fw = new FileWriter(f);
                if(f.exists()) {
                    fw = new FileWriter(f,true);
                } else {
                    fw = new FileWriter(f);
                }
                 String str="";
                str = sur.stream().map((s) -> s.getAmount()+"Survey ID: "+s.getName()+"Survey Field : " 
                        +s.oder_date+"Survey Date " +s.getReport()+"/n Report : ").reduce(str, String::concat);
               
              //str += s;
              //if toString is overridden to return
              //return id+","+name+","+cgpa+"\n"
                fw.write(str);
                fw.close();
            } catch (IOException ex) {
                
                //SHOW ex.toString() IN AN ALERT
            }
    }

    @FXML
    private void svaeInformationButtonOnClick(ActionEvent event) {
         sur.add(
            new survey(nameTextField.getText(), 
                             report.getText(),
                                      amountTextField.getText(),
                                      OderDateDatePicker.getValue()
                                      
                                      
                                     
            )
                   
                   
             
                );
    }
}

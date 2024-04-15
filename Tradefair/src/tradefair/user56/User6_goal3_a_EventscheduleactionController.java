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
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WALTON
 */
public class User6_goal3_a_EventscheduleactionController implements Initializable {

    @FXML
    private TableView<Survey_Schedule> surveyScheduleTableView;
    @FXML
    private TableColumn<Survey_Schedule,Integer> surveyIdCol;
    @FXML
    private TableColumn<Survey_Schedule, String> institutionCol;
    @FXML
    private TableColumn<Survey_Schedule, String> locationCol;
    @FXML
    private TableColumn<Survey_Schedule, LocalDate> surveyDateCol;
    //ObservableList<U8_Survey_Schedule> surveyScheduleList=FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        User6_goal3_a_EventscheduleController.surveyScheduleList.clear();
        try{
            
            File file=new File("User8_All_File//survey_Schedule_File.txt");
            if(!file.exists())file.createNewFile();
            
            
            Scanner sc=new Scanner(file);
            while(sc.hasNext()){
                String[] part=sc.nextLine().split("#");
                
                Survey_Schedule surveyScedule=new Survey_Schedule(part[0],part[1],part[2],LocalDate.parse(part[3]));
                System.out.println(surveyScedule.toString());
                User6_goal3_a_EventscheduleController.surveyScheduleList.add(surveyScedule);
                
                
            }
            
                    
        
        }catch(Exception e){
            //System.out.println("Something is Wrong!");

        }
        surveyIdCol.setCellValueFactory(new PropertyValueFactory<>("surveyId"));
        institutionCol.setCellValueFactory(new PropertyValueFactory<>("institutionName"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("institutionLocation"));
        surveyDateCol.setCellValueFactory(new PropertyValueFactory<>("surveyDate"));
        
        surveyScheduleTableView.setItems(User6_goal3_a_EventscheduleController.surveyScheduleList);
        
        
        
    }    



    @FXML
    private void SignOutOnAction(ActionEvent event) {
    }

    @FXML
    private void makeSurveyDoneOnClick(ActionEvent event) throws IOException {
        Survey_Schedule selectedSchedule=surveyScheduleTableView.getSelectionModel().getSelectedItem();
        User6_goal3_a_EventscheduleController.surveyScheduleList.remove(selectedSchedule);
        
        
        File file=new File("User8_All_File//survey_Schedule_File.txt");
        if(!file.exists())file.createNewFile();
            
        FileWriter fileWriter=new FileWriter(file);
            

        for (Survey_Schedule ss:User6_goal3_a_EventscheduleController.surveyScheduleList){
             
             fileWriter.write(ss.getSurveyId()+"#"+ss.getInstitutionName()+"#"+ss.getInstitutionLocation()+"#"+ss.getSurveyDate()+"\n");        
            // fileWriter.close();
        }
        fileWriter.close();
        try{
            File file1=new File("User8_All_File//previously_Survey_Lit_File.txt");
            if(!file1.exists())file1.createNewFile();
            FileWriter fileWriter1=new FileWriter(file1,true);
            fileWriter1.write(selectedSchedule.getSurveyId()+"#"+selectedSchedule.getInstitutionName()+"#"+selectedSchedule.getInstitutionLocation()+"#"+selectedSchedule.getSurveyDate()+"\n");
            fileWriter1.close();
        }catch(Exception e){
            System.out.println("something wrong 2");
        }
        //Show Alert that the survey is Done
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle("Survey Done");
        informationAlert.setHeaderText(null);
        informationAlert.setContentText("Survey : "+selectedSchedule.getSurveyId() + " is Done!");
        informationAlert.showAndWait();
       
        
        
        
        
    }
        
        
    }


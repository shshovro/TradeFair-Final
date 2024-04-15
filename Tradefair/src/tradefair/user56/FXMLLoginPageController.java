/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradefair.user56;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import tradefair.abid.Attendee;
import tradefair.abid.Exhibitor;

/**
 * FXML Controller class
 *
 */
public class FXMLLoginPageController implements Initializable {

    @FXML
    private TextField userid;
    @FXML
    private TextField password;
    @FXML
    private ComboBox<String> userType;

    ObservableList<String> list1 = FXCollections.observableArrayList("Manager","Programme Coordinator", "Finanace Supervisor","Director of Operation", "Registration Manager","Security Manager","Exhibitor", "Attendee");
    @FXML
    private TextField shownPassword;
    @FXML
    private ToggleButton toggleButton;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userType.setItems(list1);
    }    

    @FXML
    private void logInUser(ActionEvent event) throws Exception {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.bin"));
            User d;
            while (true) {
                d = (User) in.readObject();
//                System.out.println("Log in Successful");
                if (d.isUsername(userid.getText())&&d.isPassword(password.getText())&&d.isUsertype(this.userType.getValue()))
                {
                    System.out.println("Log in Successful");
                    String optionChosen = this.userType.getValue();
                    if(optionChosen.equalsIgnoreCase("Finanace Supervisor")){
                        finance j1= new finance(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginFinanaceSupervisor(j1);
                                                    
                    }
                    if(optionChosen.equalsIgnoreCase("Director of Operation")){
                        operation j2= new operation(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginDirectorofOperation(j2);
                        
                    }
                    
                    if(optionChosen.equalsIgnoreCase("Registration Manager")){
                        registration j3= new registration(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginRegistrationManager(j3);
                        
                    }
                     if(optionChosen.equalsIgnoreCase("Security Manager")){
                        security j4= new security(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginSecurityManager(j4);
                        
                    }
                    
                    if(optionChosen.equalsIgnoreCase("Manager")){
                        Manager j2= new Manager(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginManager(j2);
                        
                    }
                    
                    if(optionChosen.equalsIgnoreCase("Programme Coordinator")){
                        Poc j2= new Poc(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginPOC(j2);
                        
                    }
                    if(optionChosen.equalsIgnoreCase("Exhibitor")){
                        Exhibitor j5= new Exhibitor(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginExhibitor(j5);
                        
                    }
                    if(optionChosen.equalsIgnoreCase("Attendee")){
                        Attendee j6= new Attendee(d.getName(),d.getUsername(),d.getPassword(),d.getUsertype());
                        loginAttendee(j6);
                        
                    }
                    break;
                }

                else{
                    // status.setText("Not Found");
                    System.out.println("Not Found");
                }
            }
        } catch (Exception e) {
            
        }
         shownPassword.textProperty().bind(Bindings.concat(password.getText()));
         shownPassword.setVisible(false);

    }
    
    
    public void loginFinanaceSupervisor(finance u)throws Exception {
        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/tradefair/user56/User5 dashboard manual.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Finanace Supervisor");
        Scene scene = new Scene(root,709,493);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public void  loginDirectorofOperation(operation u)throws Exception {

        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/tradefair/user56/user6dashboard.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Director of Operation");
        Scene scene = new Scene(root,709,493);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
      public void loginRegistrationManager(registration u)throws Exception {
//        System.out.print("Hello");
        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/trade/fair/RegMgr.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Registration Manager");
        Scene scene = new Scene(root,956,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
       public void loginSecurityManager(security u)throws Exception {
//        System.out.print("Hello");
        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/trade/fair/SecMgr/SecMgr.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Security Manager");
        Scene scene = new Scene(root,956,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     
    
    public void loginManager(Manager u)throws Exception {

        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/tradefair/manager/Dashboard.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Manager");
        Scene scene = new Scene(root,956,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public void loginPOC(Poc u)throws Exception {

        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/tradefair/POC/POC Dashboard.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Programme Coordinator");
        Scene scene = new Scene(root,956,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void loginExhibitor(Exhibitor u)throws Exception {

        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
<<<<<<< HEAD
        loader.setLocation(getClass().getResource("/tradefair/abid/Exhibitor Dashbord.fxml"));
=======
        loader.setLocation(getClass().getResource("/tradefair/abid/Exhibitor Dashboard.fxml"));
>>>>>>> e16d88c4aafde864b1eb7efd37e3e3180fcfc86c
        Parent root = loader.load();
        primaryStage.setTitle("Exhibitor");
        Scene scene = new Scene(root,956,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
   public void loginAttendee(Attendee u)throws Exception {

        Stage stage = (Stage) userid.getScene().getWindow();
        stage.close();
        Stage primaryStage = new Stage();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/tradefair/abid/Attendee Dashboard.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Attendee");
        Scene scene = new Scene(root,956,630);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
        


    @FXML
    private void CreateNewUser(ActionEvent event)throws Exception{
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLCreateUser.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void toggleButton(ActionEvent event)  {
        if (toggleButton.isSelected()) {
            shownPassword.setVisible(true);
            shownPassword.textProperty().bind(Bindings.concat(password.getText()));
            toggleButton.setText("Hide");
        }else{
            shownPassword.setVisible(false);
            toggleButton.setText("Show");
        }
    }

}
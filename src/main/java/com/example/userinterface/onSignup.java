package com.example.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.*;

public class onSignup {


    @FXML private Button previousSignup;
    @FXML private Button NexttoLogin;
    @FXML TextField email ;
    @FXML TextField name ;
    @FXML TextField user ;
    @FXML PasswordField pass ;
    @FXML TextField cnic ;
    @FXML TextField phone ;
    @FXML TextField SrNo ;
    @FXML TextField Area ;
    @FXML TextField City ;
    private static String emailInput;
    private static String NameInput;
    private static String UserNameInput;
    private static String PassInput;
    private static long CnicInput;
    private static long PhoneNoInput;
    private static int StreetInput;
    private static String AreaInput;
    private static String CityInput;

    private static Address a1;
    private static Member m1;
    private Blood b = new Blood();

//    @FXML ComboBox<String> Area;//    @FXML ComboBox<String> City;
//    @FXML
//    private void initialize(){
//
//      //  Area.getItems().addAll("JOHAR TOWN","LDA","BAHRIA TOWN","WAPDA TOWN","DHA");
//        City.getItems().addAll("LAHORE");
//
//    }



    @FXML
    public void onSignupNextButton(ActionEvent event) throws IOException{
        emailInput= email.getText();
        NameInput = name.getText();
        UserNameInput = user.getText();
        PassInput = pass.getText();
        CnicInput = Long.parseLong(cnic.getText());
        if(functions.validateEmail(emailInput))
            MainPage.ChangeScene("Signup2.fxml");
        else
            functions.alert(Alert.AlertType.ERROR, "Invalid Email", "Please enter a valid email\nValid email format: abc@xyz.com");
    }


    @FXML
    public void SignupToLogin(ActionEvent event) throws IOException{

        PhoneNoInput= Long.parseLong(phone.getText());
        StreetInput= Integer.parseInt(SrNo.getText());
        AreaInput = Area.getText();
        CityInput = City.getText();

      //  AreaInput = String.valueOf(Area.getValue());
//        CityInput = String.valueOf(City.getValue());

        a1 = new Address(StreetInput,AreaInput,CityInput);
        m1 = new Member(emailInput,UserNameInput, PassInput, NameInput, CnicInput, PhoneNoInput,a1,b, AreaInput);
        MainPage.member.add(m1);
        functions.saveObj("Members.txt");
        MainPage.ChangeScene("Login.fxml");
    }
    @FXML
    public void PreviousSignup1(ActionEvent event) throws IOException {
        MainPage.ChangeScene("Signup1.fxml");

    }




}

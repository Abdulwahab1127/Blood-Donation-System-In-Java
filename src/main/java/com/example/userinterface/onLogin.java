package com.example.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class onLogin {

    @FXML private PasswordField LoginPass;

    @FXML private TextField LoginUser;
    String uName;
    String uPass;


    public void FinalLoginOption(ActionEvent event) throws IOException {

        uName = LoginUser.getText();
        uPass = LoginPass.getText();




            MainPage.loggedinUser = login(uName, uPass);
            if(MainPage.loggedinUser!=null) {
                MainPage.ChangeScene("homepage.fxml");
            }else {
                functions.alert(Alert.AlertType.ERROR, "Incomplete Form", "Please Check Login Credentials Again to login");

            }
    }

    private Member login(String username,String password) {
        for (Member a : MainPage.member) {
            if (a.getUserName().equals(username) && a.getPass().equals(password)) {
                //System.out.println("Verification complete. You're a member!");
                return a;
            }
        }
        //System.out.println("Not a Member!");
        return null;
}




}

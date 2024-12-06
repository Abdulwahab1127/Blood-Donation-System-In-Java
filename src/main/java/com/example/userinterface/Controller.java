package com.example.userinterface;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.io.IOException;

public class Controller {
    @FXML
    private Button onSignupClick;
    @FXML
    private Button onLoginClick;

    @FXML
    public void onSignupClick(ActionEvent event) throws IOException {

        MainPage.ChangeScene("Signup1.fxml");
    }
    @FXML
    public void onLoginClick(ActionEvent event) throws IOException {

        MainPage.ChangeScene("Login.fxml");

    }
    @FXML
    public void ClickMe(ActionEvent event) {
        functions.alert(Alert.AlertType.INFORMATION,"INFORMATION","This Application is Just a Prototype and Works only In Some Areas of Lahore\n(Johar Town,Wapda Town,LDA,DHA,Bahria Town)");
    }




}
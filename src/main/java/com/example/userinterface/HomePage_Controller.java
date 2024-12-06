package com.example.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HomePage_Controller {
    @FXML
    public void GoToReci(ActionEvent event) throws IOException {

        MainPage.ChangeScene("Recipient Page.fxml");

    }
    @FXML
    public void DonorDetails(ActionEvent event) throws IOException {

        MainPage.ChangeScene("Donor Page.fxml");

    }

    @FXML
    void ExitMethod(ActionEvent event) throws IOException {
        MainPage.Exit();
    }


}

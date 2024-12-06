package com.example.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class onDonorPage {



    @FXML
    TextField donorBloodType;
    @FXML
    TextField DonorNoBottle;
    @FXML
    TextField DonateArea;



    public void DonorPageEnter(ActionEvent event) throws IOException{

         String DonorBloodType = donorBloodType.getText();
         String DonorNoBot = DonorNoBottle.getText();
         String DonorArea = DonateArea.getText();

         Blood blood = new Blood(DonorBloodType, Integer.parseInt(DonorNoBot), MainPage.loggedinUser.getUserName(), DonorArea);

         MainPage.loggedinUser.setBlood(blood);
         functions.saveObj("Members.txt");
         MainPage.ChangeScene("DonorMessage.fxml");


    }
    public void ReturnToMenuDonor(ActionEvent event) throws IOException {


        MainPage.ChangeScene("homepage.fxml");


    }






}

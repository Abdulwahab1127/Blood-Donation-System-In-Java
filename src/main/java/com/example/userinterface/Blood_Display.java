package com.example.userinterface;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class Blood_Display {


    //TableView Display in The Donor Details
    @FXML private TableView userTable;
    @FXML private TableColumn<Member, String> DisArea;

//    @FXML private TableColumn<Member, String> DisBlood;

//    @FXML private TableColumn<Blood, String> DisCity;

    @FXML private TableColumn<Member, Integer> DisContact;

    @FXML private TableColumn<Member, String> DisEmail;

    @FXML private TableColumn<Member, String> DisName;


    //Converting All The Data Of Objects Into ArrayList to Display in ViewBox
    ObservableList<Member> membersList = FXCollections.observableArrayList();

    @FXML
    private void initialize(){
        //Sets The Desired Data in Each Column Od Name/Email/Contact/Area
        DisArea.setCellValueFactory(new PropertyValueFactory<>("area"));
        //DisBlood.setCellValueFactory(new PropertyValueFactory<>("DonoType"));
        DisContact.setCellValueFactory(new PropertyValueFactory<>("phoneNum"));
        DisEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        DisName.setCellValueFactory(new PropertyValueFactory<>("Name"));

        //This Loop Matches The Blood Type and Area from Member File
        for(Member m : MainPage.member){
            if(m.getBlood().equalsIgnoreCase(functions.searchBloodType) && m.getAddress().equalsIgnoreCase(functions.searchArea))
                membersList.add(m);
        }

        //If The Info Matches Then That Member Added to The UserTable View Using this code
        userTable.setItems(membersList);
    }
    @FXML
    public void ReturntoMenu(ActionEvent event) throws IOException {

        MainPage.ChangeScene("homepage.fxml");

    }




}

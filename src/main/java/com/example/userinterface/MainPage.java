
//MainFile For FXML Interface

package com.example.userinterface;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MainPage extends Application {


    private static Stage stg;
    static ArrayList<Member> member = new ArrayList<>();
    static Member loggedinUser = null;
    //static ArrayList<Blood> blood = new ArrayList<>();
    @Override
    public void start(Stage primaryStage) throws IOException {

        //For Members
        for (Member objects : functions.showObj("members.txt")) {
            member.add(objects);
        }


        stg = primaryStage;

        primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(MainPage.class.getResource("Main_Page.fxml"));

        primaryStage.setTitle("ATW Blood Donation System");
        primaryStage.setScene( new Scene(root, 770, 456));
        primaryStage.show();

    }

    public static void ChangeScene(String fxml) throws IOException{
        Parent pane = FXMLLoader.load(MainPage.class.getResource(fxml));
        stg.getScene().setRoot(pane);
    }
    public static void Exit() throws IOException{
        stg.close();
    }


    public static void main(String[] args) {
        launch();
    }
}
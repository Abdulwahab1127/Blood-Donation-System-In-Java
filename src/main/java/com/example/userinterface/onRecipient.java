package com.example.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class onRecipient {

    @FXML RadioButton UrgentYes;

    @FXML RadioButton UrgentNo;
    @FXML
    private ComboBox<String> area;
   // @FXML private TextField area;
    @FXML private TextField bloodType;
    @FXML private TextField bottles;
    ToggleGroup tg = new ToggleGroup();
    @FXML
    private void initialize(){
        area.getItems().addAll("JOHAR TOWN","LDA","BAHRIA TOWN","WAPDA TOWN","DHA");
        UrgentYes.setToggleGroup(tg);
        UrgentNo.setToggleGroup(tg);
        UrgentNo.setSelected(true);
    }

    @FXML
    public void RecipientDetails(ActionEvent event) throws IOException {
        String Area = String.valueOf(area.getValue());
        String BloodType = bloodType.getText();

        if(Area.isEmpty() || BloodType.isEmpty() || bottles.getText().isEmpty()){
            functions.alert(Alert.AlertType.ERROR, "Incomplete Form", "Please fill all the fields to continue");
            return;
        }
        int Bottles = Integer.parseInt(bottles.getText());
        functions.searchBloodType = BloodType;
        functions.searchArea = Area;
            try {
                if(UrgentYes.isSelected())
                    MainPage.ChangeScene("UrgentBlood.fxml");
                else
                    MainPage.ChangeScene("Display_Blood.fxml");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
       }


}


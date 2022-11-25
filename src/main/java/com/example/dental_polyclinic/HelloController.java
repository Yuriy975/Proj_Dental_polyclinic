package com.example.dental_polyclinic;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends Time_dateController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button EnterButton;

    @FXML
    private Button RegButton;

    @FXML
    void RegClick(ActionEvent event) {
        RegButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("reg.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Registration");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }


    @FXML
    void initialize() {
        EnterButton.setOnAction(event -> {
            EnterButton.getScene().getWindow().hide();
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("enter.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Вхід");
                stage.setScene(new Scene(root1));
                stage.show();
            } catch(Exception e){
                System.out.println("Error!");
            }
        });
    }


}
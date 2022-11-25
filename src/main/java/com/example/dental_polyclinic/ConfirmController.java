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

public class ConfirmController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button YesButton;

    @FXML
    private Button NoButton;

    @FXML
    void showDialog(ActionEvent event) {
        YesButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pacient.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Пацієнт");
            stage.setScene(new Scene(root1));
            stage.close();
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void showDialog2(ActionEvent event) {
        NoButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dentist.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Стоматолог");
            stage.setScene(new Scene(root1));
            stage.close();
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void initialize() {

    }
}

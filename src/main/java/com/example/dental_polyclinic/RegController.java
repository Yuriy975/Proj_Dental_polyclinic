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

public class RegController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button SendButton;

    @FXML
    void SendClick(ActionEvent event) {
        SendButton.getScene().getWindow().hide();
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("dental polyclinic");
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void initialize() {

    }
}

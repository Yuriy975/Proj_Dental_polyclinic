package com.example.dental_polyclinic;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EnterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button modalAction;

    @FXML
    void showDialog(ActionEvent actionEvent) {
        System.out.println("Enter was succefull");
        try {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("confirm2.fxml"));
            stage.setTitle("Як увійти?");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch(Exception e){
            System.out.println("Error!");
        }
    }

    @FXML
    void initialize() {

    }
}
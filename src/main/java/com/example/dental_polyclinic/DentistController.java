package com.example.dental_polyclinic;

import com.example.dental_polyclinic.collection.CollectionLogOfVisits;
import javafx.collections.ListChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DentistController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label labelCount;

    @FXML
    private TableView<Appointment> tableView;

    @FXML
    private TableColumn<Appointment, String> Date_pr;

    @FXML
    private TableColumn<Appointment, String> Time_pr;

    private CollectionLogOfVisits collectionLogOfVisits = new CollectionLogOfVisits();

    @FXML
    void initialize() {
        Date_pr.setCellValueFactory(new PropertyValueFactory<>("date"));
        Time_pr.setCellValueFactory(new PropertyValueFactory<>("time"));

        collectionLogOfVisits.getAppointmentList().addListener(new ListChangeListener<Appointment>() {
            @Override
            public void onChanged(Change<? extends Appointment> change) {
                updateList();
            }
        });

        collectionLogOfVisits.fillTestData();
        tableView.setItems(collectionLogOfVisits.getAppointmentList());
    }

    public void updateList(){
        labelCount.setText("Кількість записів " + collectionLogOfVisits.getAppointmentList().size());
    }
}

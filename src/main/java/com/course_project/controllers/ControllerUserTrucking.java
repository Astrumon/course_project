package com.course_project.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControllerUserTrucking {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textFieldPointOfDeparture;

    @FXML
    private TextField textFieldPointOfArrival;

    @FXML
    private DatePicker datePickerDateOfDeparture;

    @FXML
    private DatePicker datePickerDateOfArrival;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextArea textAreaCargoDescription;

    @FXML
    private Button buttonSaveTrucking;

    @FXML
    void buttonSaveTruckingAc(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert textFieldPointOfDeparture != null : "fx:id=\"textFieldPointOfDeparture\" was not injected: check your FXML file 'userTrucking.fxml'.";
        assert textFieldPointOfArrival != null : "fx:id=\"textFieldPointOfArrival\" was not injected: check your FXML file 'userTrucking.fxml'.";
        assert datePickerDateOfDeparture != null : "fx:id=\"datePickerDateOfDeparture\" was not injected: check your FXML file 'userTrucking.fxml'.";
        assert datePickerDateOfArrival != null : "fx:id=\"datePickerDateOfArrival\" was not injected: check your FXML file 'userTrucking.fxml'.";
        assert textFieldEmail != null : "fx:id=\"textFieldEmail\" was not injected: check your FXML file 'userTrucking.fxml'.";
        assert textAreaCargoDescription != null : "fx:id=\"textAreaCargoDescription\" was not injected: check your FXML file 'userTrucking.fxml'.";
        assert buttonSaveTrucking != null : "fx:id=\"buttonSaveTrucking\" was not injected: check your FXML file 'userTrucking.fxml'.";

    }
}

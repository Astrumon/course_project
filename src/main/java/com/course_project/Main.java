package com.course_project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("basisUserInterface.fxml"));//com/course_project/UI/interface/basisUserInterface.fxml
        primaryStage.setTitle("SPRT");
        primaryStage.setScene(new Scene(root, 1100, 700));
        primaryStage.show();
        primaryStage.setResizable(false);
    }


    public static void main(String[] args) {


        launch(args);
    }
}

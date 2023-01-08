package com.example.calapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
//        File file = new File("C:\\\\Users\\\\Loni Tande\\\\Downloads\\\\CalAppIcon");
//        Image image = new Image(file.toURI().toString());
        //stage.getIcons().add(new Image("C:\\Users\\Loni Tande\\Downloads\\CalAppIcon"));
        stage.setResizable(false);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}





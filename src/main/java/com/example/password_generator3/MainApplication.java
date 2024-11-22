package com.example.password_generator3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("home_screen.fxml"));
        Scene scene = new Scene(new Pane(), 600, 400);
        fxmlLoader.setController(new HomeController(scene));
        scene.setRoot(fxmlLoader.load());
        stage.setTitle("Password Generator");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
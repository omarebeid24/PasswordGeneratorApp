package com.example.password_generator3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Text;

import java.io.IOException;

public class AboutController {
    @FXML
    private Text about;

    private Scene scene;
    public AboutController(Scene scene){
        this.scene = scene;
    }


    @FXML
    protected void goToHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("home_screen.fxml"));
        fxmlLoader.setController(new HomeController(scene));
        scene.setRoot(fxmlLoader.load());

    }
}


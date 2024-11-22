package com.example.password_generator3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;


public class HomeController {




 @FXML
 private Button Generate_page_button;
 @FXML
    private Button Checker_page_button;
 @FXML
    private Button about_page_button;
 @FXML
    private Button quit_button;
    private Scene scene;
 public HomeController(Scene scene){
     this.scene = scene;
 }

    @FXML
    protected void goToGenerator() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("generator-view.fxml"));
        fxmlLoader.setController(new GeneratorController(scene));
        scene.setRoot(fxmlLoader.load());
    }

    @FXML
    protected void goToChecker() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("Password_Checker.fxml"));
        fxmlLoader.setController(new checkerController(scene));
        scene.setRoot(fxmlLoader.load());
    }


    @FXML
    protected void goToAbout() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("about.fxml"));
        fxmlLoader.setController(new AboutController(scene));
        scene.setRoot(fxmlLoader.load());

    }

    @FXML
    protected void closeApp() {
System.exit(0);

    }
}

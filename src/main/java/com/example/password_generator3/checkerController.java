package com.example.password_generator3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class checkerController {
    @FXML
    private TextField password_input;
    @FXML
    private Button checkButton;
    @FXML
    private Text outputText;

    private Scene scene;
    public checkerController(Scene scene){
        this.scene = scene;
    }


    @FXML
    protected void goToHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("home_screen.fxml"));
        fxmlLoader.setController(new HomeController(scene));
        scene.setRoot(fxmlLoader.load());

    }

    @FXML
    protected void onCheckerButtonClick() {

       outputText.setVisible(true);

        if (!password_input.getText().isEmpty()){
            Password checker = new Password(password_input.getText());
            outputText.setText(checker.calculateScore());
    }
        else {
        outputText.setText("You didn't enter any password");
        outputText.setVisible(true);
    }

    }
}

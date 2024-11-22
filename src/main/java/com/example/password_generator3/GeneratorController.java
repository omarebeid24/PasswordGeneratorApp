package com.example.password_generator3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.IOException;

public class GeneratorController {
    @FXML
    private TextField password_output;

    @FXML
    private Text outputText;
    @FXML
    private CheckBox upperCase;
    @FXML
    private CheckBox lowerCase;
    @FXML
    private CheckBox symbols;
    @FXML
    private CheckBox numbers;

    private Scene scene;
    public GeneratorController(Scene scene){
        this.scene = scene;
    }


    @FXML
    protected void goToHome() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("home_screen.fxml"));
        fxmlLoader.setController(new HomeController(scene));
        scene.setRoot(fxmlLoader.load());

    }

    @FXML
    protected void onGeneratorButtonClick() {
        password_output.clear();
        if (upperCase.isSelected() || lowerCase.isSelected() || numbers.isSelected() || symbols.isSelected()){
            Creator password_creator = new Creator(upperCase.isSelected(), lowerCase.isSelected(), numbers.isSelected(), symbols.isSelected());
            password_output.setText(password_creator.GeneratePassword(10).toString());
            outputText.setVisible(false);
        }
        else {
            outputText.setText("You didn't select any options");
            outputText.setVisible(true);
        }


    }
}

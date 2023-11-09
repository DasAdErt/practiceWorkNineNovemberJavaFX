package com.example.practiceworkninenovemberjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    Button button;

    @FXML
    TextField inputNumber;

    @FXML
    TextField answer;

    @FXML
    ChoiceBox choiceSystem;

    @FXML
    public void onButtonClick() {
        int number = Integer.parseInt(inputNumber.getText());

    }
}
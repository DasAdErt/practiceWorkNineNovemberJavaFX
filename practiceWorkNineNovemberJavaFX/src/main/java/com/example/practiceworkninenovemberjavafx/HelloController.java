package com.example.practiceworkninenovemberjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloController {

    @FXML
    Button button;

    @FXML
    TextField inputNumber;

    @FXML
    TextField answer;

    @FXML
    ChoiceBox<String> choiceSystem;

    @FXML
    private Label computerNameLabel;

    @FXML
    private ImageView avatarImageView;

    @FXML
    public void initialize() {
        choiceSystem.getItems().addAll("Бинарная", "Восьмеричная", "Шестнадцатеричная");
        choiceSystem.setValue("Бинарная");

        try {
            String computerName = InetAddress.getLocalHost().getHostName();
            computerNameLabel.setText(computerName);
        } catch (UnknownHostException e) {
            computerNameLabel.setText("Неизвестный компьютер");
        }

        Image avatarImage = new Image("https://media.discordapp.net/attachments/1125898813912125483/1172216042165117019/IMG_2731.JPG?ex=655f8243&is=654d0d43&hm=121c3ea49a366dd2e30a7d8c2aadb0dc20528f6dbc5319742baa8e7041d4665f&=&width=477&height=477");
        avatarImageView.setImage(avatarImage);
    }

    @FXML
    public void onButtonClick() {
        String selectedSystem = choiceSystem.getValue();
        String input = inputNumber.getText();
        int decimalValue;

        try {
            decimalValue = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            answer.setText("Введите корректное число!");
            return;
        }

        String result = convertToSystem(decimalValue, selectedSystem);
        answer.setText(result);
    }

    private String convertToSystem(int decimalValue, String system) {
        switch (system) {
            case "Бинарная":
                return Integer.toBinaryString(decimalValue);
            case "Восьмеричная":
                return Integer.toOctalString(decimalValue);
            case "Шестнадцатеричная":
                return Integer.toHexString(decimalValue).toUpperCase();
            default:
                return "Неизвестная система";
        }
    }
}
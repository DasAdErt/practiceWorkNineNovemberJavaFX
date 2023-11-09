package com.example.practiceworkninenovemberjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String iconUrl = "https://media.discordapp.net/attachments/1125898813912125483/1172219144884719657/icon.png?ex=655f8526&is=654d1026&hm=da5ddd44cb899a617f71c057ef3d81cb73ebabe1e94afd43513e5e059bc5707c&=&width=480&height=480";
        Image applicationIcon = new Image(iconUrl);
        stage.getIcons().add(applicationIcon);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 321);
        stage.setTitle("Program");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
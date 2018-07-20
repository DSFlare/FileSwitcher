package app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

class UI {

    private Stage primaryStage;
    private Controller controller;
    private Switcher switcher;


    UI(Stage primaryStage, Switcher switcher) throws Exception{
        this.primaryStage = primaryStage;
        this.switcher = switcher;

        FXMLLoader loader = new FXMLLoader(getClass().getResource("main.fxml"));
        Pane root = loader.load();

        primaryStage.setTitle("FileSwitcher");
        primaryStage.setScene(new Scene(root, root.getPrefWidth(), root.getPrefHeight()));
        primaryStage.show();

        controller = loader.getController();
        controller.ui = this;
    }

    Stage getPrimaryStage() {
        return primaryStage;
    }
    Switcher getSwitcher() {
        return switcher;
    }
}

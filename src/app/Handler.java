package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Handler extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Switcher switcher = new Switcher();
        UI ui = new UI(primaryStage, switcher);
    }


    public static void main(String[] args) {
        launch(args);
    }
}

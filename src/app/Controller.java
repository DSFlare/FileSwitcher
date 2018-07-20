package app;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {

    UI ui;
    private FileChooser fc;

    @FXML
    Label label;
    @FXML
    TextField textField1;
    @FXML
    TextField textField2;
    @FXML
    TextField textField3;



    public Controller(){
        fc = new FileChooser();
    }

    @FXML
    public void chooseFile1(){
        fc.setTitle("Choose first file");
        File file = fc.showOpenDialog(ui.getPrimaryStage());
        if (file != null) {
            ui.getSwitcher().setFile1(file);
            textField1.setText(file.getAbsolutePath());
        }
    }

    @FXML
    public void chooseFile2(){
        fc.setTitle("Choose second file");
        File file = fc.showOpenDialog(ui.getPrimaryStage());
        if (file != null) {
            ui.getSwitcher().setFile2(file);
            textField2.setText(file.getAbsolutePath());
        }
    }

    @FXML
    public void onSwitchClick(){
        ui.getSwitcher().switchFiles();
    }
}

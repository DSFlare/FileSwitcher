package app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    Button switchButton;



    public Controller(){
        fc = new FileChooser();
    }

    public void setUI(UI ui) {
        this.ui = ui;
        if (ui.getSwitcher().isFilesLoaded())
            label.setVisible(false);
    }

    @FXML
    public void chooseFile1(){
        fc.setTitle("Choose first file");
        File file = fc.showOpenDialog(ui.getPrimaryStage());
        if (file != null) {
            ui.getSwitcher().setFile1(file);
            textField1.setText(file.getAbsolutePath());

            if (ui.getSwitcher().isFilesLoaded()) {
                label.setVisible(false);
                switchButton.setDisable(false);
            }
        }
    }

    @FXML
    public void chooseFile2(){
        fc.setTitle("Choose second file");
        File file = fc.showOpenDialog(ui.getPrimaryStage());
        if (file != null) {
            ui.getSwitcher().setFile2(file);
            textField2.setText(file.getAbsolutePath());

            if (ui.getSwitcher().isFilesLoaded()) {
                label.setVisible(false);
                switchButton.setDisable(false);
            }
        }

    }

    @FXML
    public void onSwitchClick(){
        if (ui.getSwitcher().switchFiles() == 0){
            String buf = textField1.getText();
            textField1.setText(textField2.getText());
            textField2.setText(buf);
        }
    }
}

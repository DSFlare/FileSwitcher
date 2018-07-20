package app;

import javafx.stage.FileChooser;

import java.io.File;

public class Switcher {

    private File file1, file2;
    private String path1, path2;

    public Switcher(){

    }

    public Switcher(String path1, String path2){

    }

    public void setFile1(File file1) {
        this.file1 = file1;
        path1 = file1.getAbsolutePath();
    }
    public void setFile2(File file2) {
        this.file2 = file2;
        path2 = file2.getAbsolutePath();
    }
    public File getFile1() {
        return file1;
    }
    public File getFile2() {
        return file2;
    }
    public void switchFiles(){

    }
}

package fxTelDir;

import javafx.fxml.FXML;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Controller {

    @FXML
    public TextArea textArea;

    @FXML
    public  TextField textFieldForNumber;

    @FXML
     public TextField textFieldForName;




    private void addToDirect(){
        String strNumber = textFieldForNumber.getText();
        String strName = textFieldForName.getText();
        TelDirectory telDirectory = new TelDirectory(strNumber, strName);
        textArea.append(strName + " " + strNumber + "\n");


    }

    public void addNewNote(ActionEvent actionEvent){
        this.addToDirect();
    }


}

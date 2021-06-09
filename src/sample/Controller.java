package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField n1;

    @FXML
    private TextField n2;

    @FXML
    private Label display;


    public void caladdition(ActionEvent event){
        float number1= Float.parseFloat(n1.getText());
        float number2= Float.parseFloat((n2.getText()));

        display.setText(String.valueOf(number1+number2));
    }
}

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField n1;

    @FXML
    private TextField n2;

    @FXML
    private Button addition;

    @FXML
    private Label display;

    @FXML
    void caladdition(ActionEvent event){
        int number1= Integer.parseInt(n1.getText());
        int number2= Integer.parseInt(n2.getText());

        display.setText(String.valueOf(number1+number2));
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.BinaryCalculatorModel;
import model.InvalidDivisionException;

public class BinaryCalculatorController {

    private BinaryCalculatorModel model;

    @FXML
    private Label result;

    @FXML
    private TextField number1;

    @FXML
    private TextField number2;

    @FXML
    public void initialize() {
        model = new BinaryCalculatorModel();
    }

    public void calculate(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();

        if (button.getId().equals("addButton")) {
            result.setText(model.binaryAdd(number1.getText(), number2.getText()));
        } else if (button.getId().equals("subtractButton")) {
            result.setText(model.binarySubtract(number1.getText(), number2.getText()));
        } else if (button.getId().equals("multiplyButton")) {
            result.setText(model.binaryMultiply(number1.getText(), number2.getText()));
        } else if (button.getId().equals("divideButton")) {
            try {
                result.setText(model.binaryDivide(number1.getText(), number2.getText()));
            } catch (InvalidDivisionException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Division by zero!");
                alert.show();
            }
        }
    }
}

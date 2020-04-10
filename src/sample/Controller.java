package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textFieldTargetFunctionNumOne;
    @FXML
    private TextField textFieldTargetFunctionNumTwo;

    @FXML
    private void calculate() {

        String targetFunctionNumOne = textFieldTargetFunctionNumOne.getText();
        String targetFunctionNumTwo = textFieldTargetFunctionNumTwo.getText();

        boolean result = new Check().checkSymbols(targetFunctionNumOne, targetFunctionNumTwo);

        if (result) {
            new Alerts().alertWrongSymbol();
        } else {
            new GraphicalAnalysis().graphicalAnalysis(targetFunctionNumOne, targetFunctionNumOne);
        }
    }
}
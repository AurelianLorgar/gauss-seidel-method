package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button buttonCalculate;
    @FXML
    private TextField textFieldTargetFunction;
    @FXML
    private TextField textFieldStartingPoint;
    @FXML
    private TextField textFieldUnconditionalMinimum;
    @FXML
    private TextField textFieldLambda;

    private GraphicalAnalysis graphicalAnalysis = new GraphicalAnalysis();

    @FXML
    private void calculate() {

        String[] symbols = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "^", "x", "y"};
        String targetFunction = textFieldTargetFunction.getText();

        for (String symbol : symbols) {
            if (!targetFunction.equals(symbol)) {
                //TODO: сообщение о недопустимом символе
                return;
            }
        }
        graphicalAnalysis.graphicalAnalysis(targetFunction);
    }
}
package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField textFieldTargetFunctionNumOne;
    @FXML
    private TextField textFieldTargetFunctionNumTwo;
    /*@FXML
    private TextField textFieldStartingPoint;
    @FXML
    private TextField textFieldUnconditionalMinimum;
    @FXML
    private TextField textFieldLambda;*/

    private GraphicalAnalysis graphicalAnalysis = new GraphicalAnalysis();

    @FXML
    private void calculate() {

        String[] symbols = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String targetFunctionNumOne = textFieldTargetFunctionNumOne.getText();
        String targetFunctionNumTwo = textFieldTargetFunctionNumTwo.getText();
        byte counter = 0;
        //TODO: проверка каждого символа по отдельности
        for (String symbol : symbols) {
            if ((!targetFunctionNumOne.equals(symbol) || (!targetFunctionNumTwo.equals(symbol)))) {
                counter++;
            }
        }

        if (counter == 10) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Ошибка!");
            alert.setContentText("В поля num1 и num2 допускается вводить только цифры");
            alert.showAndWait();
        } else {
            graphicalAnalysis.graphicalAnalysis(targetFunctionNumOne, targetFunctionNumOne);
        }
    }
}
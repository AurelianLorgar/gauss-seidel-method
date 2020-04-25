package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class Controller {

    private GaussSeidel gaussSeidel = new GaussSeidel();
    private Check check = new Check();
    private Alerts alerts = new Alerts();

    @FXML
    private TextField textFieldStartingPointX;
    @FXML
    private TextField textFieldStartingPointY;
    @FXML
    private TextField textFieldStepSize;
    @FXML
    private TextField textFieldLambda;
    @FXML
    private LineChart lineChart;

    @FXML
    private void close() {
        Platform.exit();
    }

    @FXML
    private void aboutProgram() {

    }

    @FXML
    private void aboutMethod() {

    }

    @FXML
    private void howItWorks() {

    }

    @FXML
    private void whatToDo() {

    }

    @FXML
    private void showDiagram() {

    }

    @FXML
    private void calculate() {
        calculateGaussSeidel();
    }

   /* private void calculateGraphicalAnalysis() {

        lineChart.setCreateSymbols(false);

        boolean resultOne = check.checkSymbols(targetFunctionNumOne);
        boolean resultTwo = check.checkSymbols(targetFunctionNumTwo);

        if ((resultOne) || (resultTwo)) {
            alerts.alertWrongSymbol("Целевая функция");
        } else {
            graphicalAnalysis.graphicalAnalysis(targetFunctionNumOne, targetFunctionNumOne);

            addToChart(graphicalAnalysis.xPlusFirst, graphicalAnalysis.xMinusFirst, graphicalAnalysis.yAxisFirst);
            addToChart(graphicalAnalysis.xPlusSecond, graphicalAnalysis.xMinusSecond, graphicalAnalysis.yAxisSecond);
            addToChart(graphicalAnalysis.xPlusThird, graphicalAnalysis.xMinusThird, graphicalAnalysis.yAxisThird);
            addToChart(graphicalAnalysis.xPlusFourth, graphicalAnalysis.xMinusFourth, graphicalAnalysis.yAxisFourth);
        }
    }*/

    private void calculateGaussSeidel() {

        String startingPointX = textFieldStartingPointX.getText();
        String startingPointY = textFieldStartingPointY.getText();
        String stepSize = textFieldStepSize.getText();
        String pointLambda = textFieldLambda.getText();

        if ((check.checkSymbols(startingPointX)) || (check.checkSymbols(startingPointY))) {
            alerts.alertWrongSymbol("Начальная точка");
        } else if (check.checkSymbols(stepSize)){
            alerts.alertWrongSymbol("Величина шага");
        } else if (check.checkSymbols(pointLambda)) {
            alerts.alertWrongSymbol("λ");
        } else {
            gaussSeidel.gaussSeidel(startingPointX, startingPointY, stepSize, pointLambda);
        }
    }

    /*private void addToChart(ArrayList<Double> xPlus, ArrayList<Double> xMinus, ArrayList<Double> yAxis) {

        XYChart.Series<Double, Double> seriesPlus = new XYChart.Series<>();
        XYChart.Series<Double, Double> seriesMinus = new XYChart.Series<>();

        seriesPlus.getData().clear();
        seriesMinus.getData().clear();

        for (int i = 0; i < yAxis.size(); i++) {
            seriesPlus.getData().add(new XYChart.Data<>(xPlus.get(i), yAxis.get(i)));
            seriesMinus.getData().add(new XYChart.Data<>(xMinus.get(i), yAxis.get(i)));
        }

        lineChart.getData().addAll(seriesPlus, seriesMinus);
    }*/
}
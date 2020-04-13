package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    private GraphicalAnalysis graphicalAnalysis = new GraphicalAnalysis();

    @FXML
    private TextField textFieldTargetFunctionNumOne;
    @FXML
    private TextField textFieldTargetFunctionNumTwo;
    @FXML
    private LineChart lineChart;

    @FXML
    private void calculate() {

        String targetFunctionNumOne = textFieldTargetFunctionNumOne.getText();
        String targetFunctionNumTwo = textFieldTargetFunctionNumTwo.getText();

        boolean result = new Check().checkSymbols(targetFunctionNumOne, targetFunctionNumTwo);

        if (result) {
            new Alerts().alertWrongSymbol();
        } else {
            graphicalAnalysis.graphicalAnalysis(targetFunctionNumOne, targetFunctionNumOne);
            addToChart();
        }
    }

    //TODO: починить отображение и очистку поля
    private void addToChart() {

        lineChart.setCreateSymbols(false);

        XYChart.Series<Double, Double> series25Plus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series25Minus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series50Plus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series50Minus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series100Plus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series100Minus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series200Plus = new XYChart.Series<>();
        XYChart.Series<Double, Double> series200Minus = new XYChart.Series<>();

        series25Plus.getData().clear();
        series25Minus.getData().clear();
        series50Plus.getData().clear();
        series50Minus.getData().clear();
        series100Plus.getData().clear();
        series100Minus.getData().clear();
        series200Plus.getData().clear();
        series200Minus.getData().clear();

        ArrayList<Double> xPlusFirst = graphicalAnalysis.xPlusFirst;
        ArrayList<Double> xMinusFirst = graphicalAnalysis.xMinusFirst;
        ArrayList<Double> yAxisFirst = graphicalAnalysis.yAxisFirst;

        ArrayList<Double> xPlusSecond = graphicalAnalysis.xPlusSecond;
        ArrayList<Double> xMinusSecond = graphicalAnalysis.xMinusSecond;
        ArrayList<Double> yAxisSecond = graphicalAnalysis.yAxisSecond;

        ArrayList<Double> xPlusThird = graphicalAnalysis.xPlusThird;
        ArrayList<Double> xMinusThird = graphicalAnalysis.xMinusThird;
        ArrayList<Double> yAxisThird = graphicalAnalysis.yAxisThird;

        ArrayList<Double> xPlusFourth = graphicalAnalysis.xPlusFourth;
        ArrayList<Double> xMinusFourth = graphicalAnalysis.xMinusFourth;
        ArrayList<Double> yAxisFourth = graphicalAnalysis.yAxisFourth;

        for (int i = 0; i < yAxisFirst.size(); i++) {
            series25Plus.getData().add(new XYChart.Data<>(xPlusFirst.get(i), yAxisFirst.get(i)));
            series25Minus.getData().add(new XYChart.Data<>(xMinusFirst.get(i), yAxisFirst.get(i)));
        }
        lineChart.getData().add(series25Plus);
        lineChart.getData().add(series25Minus);

        for (int i = 0; i < yAxisSecond.size(); i++) {
            series50Plus.getData().add(new XYChart.Data<>(xPlusSecond.get(i), yAxisSecond.get(i)));
            series50Minus.getData().add(new XYChart.Data<>(xMinusSecond.get(i), yAxisSecond.get(i)));
        }
        lineChart.getData().add(series50Plus);
        lineChart.getData().add(series50Minus);

        for (int i = 0; i < yAxisThird.size(); i++) {
            series100Plus.getData().add(new XYChart.Data<>(xPlusThird.get(i), yAxisThird.get(i)));
            series100Minus.getData().add(new XYChart.Data<>(xMinusThird.get(i), yAxisThird.get(i)));
        }
        lineChart.getData().add(series100Plus);
        lineChart.getData().add(series100Minus);

        for (int i = 0; i < yAxisFourth.size(); i++) {
            series200Plus.getData().add(new XYChart.Data<>(xPlusFourth.get(i), yAxisFourth.get(i)));
            series200Minus.getData().add(new XYChart.Data<>(xMinusFourth.get(i), yAxisFourth.get(i)));
        }
        lineChart.getData().add(series200Plus);
        lineChart.getData().add(series200Minus);
    }
}
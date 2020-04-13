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
        lineChart.setCreateSymbols(false);

        boolean result = new Check().checkSymbols(targetFunctionNumOne, targetFunctionNumTwo);

        if (result) {
            new Alerts().alertWrongSymbol();
        } else {
            graphicalAnalysis.graphicalAnalysis(targetFunctionNumOne, targetFunctionNumOne);
            addToChart(graphicalAnalysis.xPlusFirst, graphicalAnalysis.xMinusFirst, graphicalAnalysis.yAxisFirst);
            addToChart(graphicalAnalysis.xPlusSecond, graphicalAnalysis.xMinusSecond, graphicalAnalysis.yAxisSecond);
            addToChart(graphicalAnalysis.xPlusThird, graphicalAnalysis.xMinusThird, graphicalAnalysis.yAxisThird);
            addToChart(graphicalAnalysis.xPlusFourth, graphicalAnalysis.xMinusFourth, graphicalAnalysis.yAxisFourth);
        }
    }

    //TODO: починить отображение и очистку поля и сделать так, чтобы разные графики были одного цвета и были соединены
    private void addToChart(ArrayList<Double> xPlus, ArrayList<Double> xMinus, ArrayList<Double> yAxis) {

        XYChart.Series<Double, Double> seriesPlus = new XYChart.Series<>();
        XYChart.Series<Double, Double> seriesMinus = new XYChart.Series<>();

        seriesPlus.getData().clear();
        seriesMinus.getData().clear();

        for (int i = 0; i < yAxis.size(); i++) {
            seriesPlus.getData().add(new XYChart.Data<>(xPlus.get(i), yAxis.get(i)));
            seriesMinus.getData().add(new XYChart.Data<>(xMinus.get(i), yAxis.get(i)));
        }
        lineChart.getData().add(seriesPlus);
        lineChart.getData().add(seriesMinus);
    }
}
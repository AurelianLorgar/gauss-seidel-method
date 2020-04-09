package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.BubbleChart;

class GraphicalAnalysis {

    @FXML
    private BubbleChart bubbleChart;

    void graphicalAnalysis(String targetFunctionNumberOne, String targetFunctionNumberTwo){

        int[] functionValue = {25, 50, 100, 200};

        double[] firstValue;

        int numberOne = Integer.parseInt(targetFunctionNumberOne);
        int numberTwo = Integer.parseInt(targetFunctionNumberTwo);

        for (int aFunctionValue : functionValue) {

        }
    }
}

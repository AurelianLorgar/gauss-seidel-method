package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;

class GraphicalAnalysis {

    @FXML
    private BubbleChart bubbleChart;

    void graphicalAnalysis(String targetFunctionNumberOne, String targetFunctionNumberTwo) {

        int[] functionValue = {25, 50, 100, 200};

        double[] y;

        double numberOne = Integer.parseInt(targetFunctionNumberOne);
        double numberTwo = Integer.parseInt(targetFunctionNumberTwo);

        /*double xPlus = 0.5*(2*numberOne+Math.sqrt(-3*(Math.pow(numberTwo, 2))+6*numberTwo*y[i]+4*functionValue[i]
                - 3*(Math.pow(y[i], 2)))) + numberTwo - y;*/

        /*double xMinus = 0.5*(2*numberOne-Math.sqrt(-3*(Math.pow(numberTwo, 2))+6*numberTwo*y[i]+4*functionValue[i]
                - 3*(Math.pow(y[i], 2)))) + numberTwo - y;*/
    }
}

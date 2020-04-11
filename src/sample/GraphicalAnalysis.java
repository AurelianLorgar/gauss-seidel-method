package sample;

import javafx.fxml.FXML;
import javafx.scene.chart.BubbleChart;

class GraphicalAnalysis {

    @FXML
    private BubbleChart bubbleChart;

    void graphicalAnalysis(String targetFunctionNumberOne, String targetFunctionNumberTwo) {

        MathOperations mathOperations = new MathOperations();

        double numberOne = Integer.parseInt(targetFunctionNumberOne);
        double numberTwo = Integer.parseInt(targetFunctionNumberTwo);

        int[] functionValue = {25, 50, 100, 200};

        double[] y = {0, 2, -2, 4, -4, 6, -6, 8, -8, 10, -10, 12, -12, 14};

        /*TODO: переделать массивы в листы, иначе ничего не выйдет, после чего сделать удаление одинаковых элементов и
          TODO: засунуть всё это в BubbleChart*/
        double[] xPlusFirst = new double[y.length];
        double[] xMinusFirst = new double[y.length];

        double[] xPlusSecond = new double[y.length];
        double[] xMinusSecond = new double[y.length];

        double[] xPlusThird = new double[y.length];
        double[] xMinusThird = new double[y.length];

        double[] xPlusFourth = new double[y.length];
        double[] xMinusFourth = new double[y.length];

        for (int i = 0; i < functionValue.length; i++) {
            for (int j = 0; j < y.length; j++) {
                switch (i) {
                    case (0):
                        xPlusFirst[j] = mathOperations.calculatePlus(y[j], numberOne, numberTwo, functionValue[i]);
                        xMinusFirst[j] = mathOperations.calculateMinus(y[j], numberOne, numberTwo, functionValue[i]);
                        break;
                    case (1):
                        xPlusSecond[j] = mathOperations.calculatePlus(y[j], numberOne, numberTwo, functionValue[i]);
                        xMinusSecond[j] = mathOperations.calculateMinus(y[j], numberOne, numberTwo, functionValue[i]);
                        break;
                    case (2):
                        xPlusThird[j] = mathOperations.calculatePlus(y[j], numberOne, numberTwo, functionValue[i]);
                        xMinusThird[j] = mathOperations.calculateMinus(y[j], numberOne, numberTwo, functionValue[i]);
                        break;
                    case (3):
                        xPlusFourth[j] = mathOperations.calculatePlus(y[j], numberOne, numberTwo, functionValue[i]);
                        xMinusFourth[j] = mathOperations.calculateMinus(y[j], numberOne, numberTwo, functionValue[i]);
                        break;
                }
            }
        }
    }
}

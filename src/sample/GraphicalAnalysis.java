package sample;

import java.util.ArrayList;

class GraphicalAnalysis extends Thread{

    private MathOperations mathOperations = new MathOperations();

    ArrayList<Double> xPlusFirst = new ArrayList<>();
    ArrayList<Double> xMinusFirst = new ArrayList<>();
    ArrayList<Double> yAxisFirst = new ArrayList<>();

    ArrayList<Double> xPlusSecond = new ArrayList<>();
    ArrayList<Double> xMinusSecond = new ArrayList<>();
    ArrayList<Double> yAxisSecond = new ArrayList<>();

    ArrayList<Double> xPlusThird = new ArrayList<>();
    ArrayList<Double> xMinusThird = new ArrayList<>();
    ArrayList<Double> yAxisThird = new ArrayList<>();

    ArrayList<Double> xPlusFourth = new ArrayList<>();
    ArrayList<Double> xMinusFourth = new ArrayList<>();
    ArrayList<Double> yAxisFourth = new ArrayList<>();

    void graphicalAnalysis(String targetFunctionNumberOne, String targetFunctionNumberTwo) {

        ArrayList<Double> yAxisArray = new ArrayList<>();
        //FIXME конвертировать в дабл по человечески, а не через инт
        double numberOne = Integer.parseInt(targetFunctionNumberOne);
        double numberTwo = Integer.parseInt(targetFunctionNumberTwo);
        double checkPlus;
        double checkMinus;

        int[] functionValue = {25, 50, 75, 100};

        for (double i = -100; i < 100.01; i = i + 0.01) {
            yAxisArray.add(new MathOperations().round(i));
        }

        for (int i = 0; i < functionValue.length; i++) {
            for (double y : yAxisArray) {
                switch (i) {
                    case (0):
                        checkPlus = mathOperations.calculatePlus(y, numberOne, numberTwo, functionValue[i]);
                        checkMinus = mathOperations.calculateMinus(y, numberOne, numberTwo, functionValue[i]);
                        if ((checkPlus != -1.0) && (checkMinus != -1.0)) {
                            xPlusFirst.add(checkPlus);
                            xMinusFirst.add(checkMinus);
                            yAxisFirst.add(y);
                        }
                        break;
                    case (1):
                        checkPlus = mathOperations.calculatePlus(y, numberOne, numberTwo, functionValue[i]);
                        checkMinus = mathOperations.calculateMinus(y, numberOne, numberTwo, functionValue[i]);
                        if ((checkPlus != -1.0) && (checkMinus != -1.0)) {
                            xPlusSecond.add(checkPlus);
                            xMinusSecond.add(checkMinus);
                            yAxisSecond.add(y);
                        }
                        break;
                    case (2):
                        checkPlus = mathOperations.calculatePlus(y, numberOne, numberTwo, functionValue[i]);
                        checkMinus = mathOperations.calculateMinus(y, numberOne, numberTwo, functionValue[i]);
                        if ((checkPlus != -1.0) && (checkMinus != -1.0)) {
                            xPlusThird.add(checkPlus);
                            xMinusThird.add(checkMinus);
                            yAxisThird.add(y);
                        }
                        break;
                    case (3):
                        checkPlus = mathOperations.calculatePlus(y, numberOne, numberTwo, functionValue[i]);
                        checkMinus = mathOperations.calculateMinus(y, numberOne, numberTwo, functionValue[i]);
                        if ((checkPlus != -1.0) && (checkMinus != -1.0)) {
                            xPlusFourth.add(checkPlus);
                            xMinusFourth.add(checkMinus);
                            yAxisFourth.add(y);
                        }
                        break;
                }
            }
        }
    }
}
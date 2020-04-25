package sample;

import java.util.ArrayList;

class GaussSeidel extends Thread{

    private MathOperations mathOperations = new MathOperations();
    ArrayList<String> calculationLog = new ArrayList<>();
    ArrayList<Double> xAxis = new ArrayList<>();
    ArrayList<Double> yAxis = new ArrayList<>();

    void gaussSeidel(String startingPointX, String startingPointY, String step, String accuracy) {

        double pointX = Double.parseDouble(startingPointX);
        double pointY = Double.parseDouble(startingPointY);
        double stepSize = Double.parseDouble(step);
        double lambda = Double.parseDouble(accuracy);

        /*double result;
        double resultTemp;
        double pointX = Integer.parseInt(startingPointX);
        double pointY = Integer.parseInt(startingPointY);
        ArrayList<Double> methodListX = new ArrayList<>();
        ArrayList<Double> methodListY = new ArrayList<>();
        methodListX.add(pointX);
        methodListY.add(pointY);

        result = mathOperations.calculateFunction(pointX, pointY);
        resultTemp = mathOperations.calculateFunction(pointX + 2, pointY);

        System.out.println(result);
        System.out.println(resultTemp);*/
    }
}

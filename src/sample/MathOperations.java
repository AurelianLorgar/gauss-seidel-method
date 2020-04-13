package sample;

import java.math.BigDecimal;
import java.math.RoundingMode;

class MathOperations {

    double calculatePlus(double yAxis, double numOne, double numTwo, double value) {

        double intermediateValue;
        double yAxisPower;
        double numTwoPower;
        double plus;

        yAxisPower = power(yAxis);
        numTwoPower = power(numTwo);
        intermediateValue = -3 * numTwoPower + 6 * numTwo * yAxis + 4 * value - 3 * yAxisPower;
        intermediateValue = sqrt(intermediateValue);
        if (intermediateValue == -1) {
            return -1;
        }
        plus = 2 * numOne + intermediateValue;
        plus = 0.5 * plus;
        plus = plus + numTwo - yAxis;
        plus = round(plus);
        return plus;
    }

    double calculateMinus(double yAxis, double numOne, double numTwo, double value) {

        double intermediateValue;
        double yAxisPower;
        double numTwoPower;
        double minus;

        yAxisPower = power(yAxis);
        numTwoPower = power(numTwo);
        intermediateValue = -3 * numTwoPower + 6 * numTwo * yAxis + 4 * value - 3 * yAxisPower;
        intermediateValue = sqrt(intermediateValue);
        if (intermediateValue == -1) {
            return -1;
        }
        minus = 2 * numOne - intermediateValue;
        minus = 0.5 * minus;
        minus = minus + numTwo - yAxis;
        minus = round(minus);
        return minus;
    }

    private double power(double num) {
        double result;

        result = Math.pow(num, 2);
        return result;
    }

    private double sqrt(double num) {
        double result;

        result = Math.sqrt(num);

        if (Double.isNaN(result)) {
            return -1;
        } else {
            return result;
        }
    }

    double round(double num) {
        BigDecimal bd = new BigDecimal(Double.toString(num));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
package sample;

class Check {

    boolean checkSymbols(String numberOne, String numberTwo) {

        char[] symbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-'};
        char[] numOneChar = numberOne.toCharArray();
        char[] numTwoChar = numberTwo.toCharArray();

        byte[] counterOne = new byte[numOneChar.length];
        byte[] counterTwo = new byte[numTwoChar.length];

        for (char symbol : symbols) {
            for (int j = 0; j < numOneChar.length; j++) {
                if (symbol != numOneChar[j]) {
                    counterOne[j]++;
                }
            }

            for (int j = 0; j < numTwoChar.length; j++) {
                if (symbol != numTwoChar[j]) {
                    counterTwo[j]++;
                }
            }
        }
        return (getResult(counterOne)) && (getResult(counterTwo));
    }

    private boolean getResult(byte[] counterArray) {

        for (byte counter : counterArray) {
            if (counter == 11) {
                return true;
            }
        }
        return false;
    }
}
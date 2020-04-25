package sample;

class Check {

    boolean checkSymbols(String number) {


        if (number.equals("")) {
            return true;
        }

        char[] symbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '.', ','};
        char[] numChar = number.toCharArray();

        byte[] counter = new byte[numChar.length];

        for (char symbol : symbols) {
            for (int j = 0; j < numChar.length; j++) {
                if (symbol != numChar[j]) {
                    counter[j]++;
                }
            }
        }
        return getResult(counter);
    }

    private boolean getResult(byte[] counterArray) {

        for (byte counter : counterArray) {
            if (counter == 13) {
                return true;
            }
        }
        return false;
    }
}
public class Convector {

    public static int ConvectorArr(String[][] Arr) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;

        if (Arr.length != 4) throw new MyArraySizeException();

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i].length != 4) throw new MyArraySizeException();

            for (int j = 0; j < Arr.length; j++) {
                try {
                    sum += Integer.parseInt(Arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
            return sum;
    }
}
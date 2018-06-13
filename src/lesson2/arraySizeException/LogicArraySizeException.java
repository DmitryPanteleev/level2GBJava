package lesson2.arraySizeException;

public class LogicArraySizeException {

    public static void start() throws MyArraySizeException {
        String[][] goodArray = new String[4][4];
        String[][] badArray = new String[4][5];

        System.out.println("\n" + arraySize(goodArray));
        System.out.println("\n" + arraySize(badArray) + "\n" + "\n");
    }

    private static String arraySize(String[][] array) throws MyArraySizeException {
        if (array.length == 4 && array[0].length == 4 && array[1].length == 4 && array[2].length == 4 && array[3].length == 4) {
            return "ArrSize 4x4";
        } else {
            throw new MyArraySizeException("MyArraySizeException NOT 4x4");
        }
    }

}

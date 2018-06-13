package lesson2.summArr;

public class LogicSummArray {

    public static void start() throws MyArrayDataException {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "1.1", "1.5"};
        String[] array2 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "1.1", "a"};

        System.out.println(summInt(array));
        System.out.println(summInt(array2));

    }

    private static int summInt(String[] array) throws MyArrayDataException {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("^[a-z]") | array[i].matches("^[A-Z]")) {
                throw new MyArrayDataException("Вот это не может быть числом " + "\"" + array[i] + "\" позиция в массиве номер: " + i);
            }
            result = (int) (result + Double.parseDouble(array[i]));

        }
        return result;
    }

}

package lesson3.arrayCountWord;

import java.util.ArrayList;
import java.util.List;

public class LogicCountWord {

    public static void start(int arraySize) {

        counterWord(createArrayList(arraySize));

    }

    private static void counterWord(List array) {

        List countWordList = new ArrayList();
        ArrayList<Integer> countList = new ArrayList<Integer>();


        for (int i = 0; i < array.size(); i++) {
            if (!countWordList.contains(array.get(i))) {
                countWordList.add(array.get(i));
                countList.add(1);
            } else {
                int index = countWordList.indexOf(array.get(i));
                countList.set(index, countList.get(index)+1);
            }
        }
        for (int i = 0; i < countWordList.size(); i++) {
            System.out.println(countWordList.get(i)+ " Встретилось " + countList.get(i) + " раз ");
        }

    }

    private static List createArrayList(int arraySize) {

        ArrayList arrayString = new ArrayList();
        arrayString.ensureCapacity(arraySize);
        for (int i = 0; i < arraySize; i++) {
            arrayString.add(("Word" + ((int) (1 + (Math.random() * 10)))).toString());
        }
        return arrayString;
    }

}

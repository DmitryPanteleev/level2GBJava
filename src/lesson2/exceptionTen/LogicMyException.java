package lesson2.exceptionTen;

import lesson2.exceptionTen.myException.*;

import java.util.ArrayList;
import java.util.List;

public class LogicMyException {

    public static void start() {

        List exceptionList = new ArrayList();

        for (int i = 1; i < 11; i++) {

            try {
                generatedException(i);
            } catch (Exception e) {
                exceptionList.add(e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("\n" + "Содержимое листа ошибок: " + exceptionList + "\n" + "\n");
    }

    private static void generatedException(int i) throws Exception {

        switch (i) {
            case 1:
                throw new ExceptionNumOne("Exception 1");

            case 2:
                throw new ExceptionNumTwo("Exception 2");

            case 3:
                throw new ExceptionNumThree("Exception 3");

            case 4:
                throw new ExceptionNumFour("Exception 4");

            case 5:
                throw new ExceptionNumberFive("Exception 5");

            case 6:
                throw new ExceptionNumSix("Exception 6");

            case 7:
                throw new ExceptionNumSeven("Exception 7");

            case 8:
                throw new ExceptionNumOne("Exception 8");

            case 9:
                throw new ExceptionNumOne("Exception 9");

            case 10:
                throw new ExceptionNumOne("Exception 10");

            default:
                System.out.println(" No exception");
        }
    }

}

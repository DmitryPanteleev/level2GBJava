package lesson2;

import lesson2.arraySizeException.LogicArraySizeException;
import lesson2.arraySizeException.MyArraySizeException;
import lesson2.bodyMassIndex.LogicBMI;
import lesson2.enumDayOfWeek.LogicDayOfWeek;
import lesson2.exceptionTen.LogicMyException;
import lesson2.summArr.LogicSummArray;
import lesson2.summArr.MyArrayDataException;

import java.io.IOException;

public class MainLesson2 {

    public static void main(String[] args) throws IOException, MyArraySizeException, MyArrayDataException {

//        LogicDayOfWeek.start();

//        LogicMyException.start();

//        LogicBMI.start();

        LogicArraySizeException.start();

        LogicSummArray.start();

    }

}

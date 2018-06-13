package lesson2;

import lesson2.bodyMassIndex.LogicBMI;
import lesson2.enumDayOfWeek.LogicDayOfWeek;
import lesson2.exceptionTen.LogicMyException;

import java.io.IOException;

public class MainLesson2 {

    public static void main(String[] args) throws IOException {

        LogicDayOfWeek.start();

        LogicMyException.start();

        LogicBMI.start();

    }

}

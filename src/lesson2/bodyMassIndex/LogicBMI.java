package lesson2.bodyMassIndex;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogicBMI {


    private static String bodyMassIndex(int weight, double height) {
        double bMI = weight / (Math.pow(height, 2));
        if (bMI < 18.5) return "Under";
        else if (bMI < 25.0) return "Normal";
        else if (bMI < 30) return "over";
        else return "obese";
    }

    public static void start() throws IOException {

        Files.lines(Paths.get("E:/javaProjects/level2GB/src/lesson2/bodyMassIndex/weight and height.txt"))
                .forEach(line -> System.out.println(bodyMassIndex(
                        Integer.parseInt(line.split(" ")[0]),
                        Double.parseDouble(line.split(" ")[1])
                )));

    }

}

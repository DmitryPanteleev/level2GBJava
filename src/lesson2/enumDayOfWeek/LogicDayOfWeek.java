package lesson2.enumDayOfWeek;

public class LogicDayOfWeek {

    public static void start() {

        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.MONDAY));
        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.TUESDAY));
        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.WEDNESDAY));
        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.THURSDAY));
        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.SATURDAY));
        System.out.println("Осталось работать: " + getWorkingHours(DayOfWeek.SUNDAY));
        System.out.println();
    }


    private static int getWorkingHours(Enum dayOfWeek) {

        if (dayOfWeek.ordinal() == 6 | dayOfWeek.ordinal() == 5) {
            return 0;
        } else return 40 - (dayOfWeek.ordinal() * 8);
    }

}

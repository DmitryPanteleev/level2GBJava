package lesson3.arrayCountWord;

public class CheckPass {

    public static void start() {
        System.out.println("Проверка пароля");
        System.out.println(check("1234567") + " 1234567");
        System.out.println(check("12345678") + " 12345678");
        System.out.println(check("abcdefgh") + " abcdefgh");
        System.out.println(check("1234567A8") + " 1234567A8");
        System.out.println(check("A1234567A") + " A1234567A");
        System.out.println(check("123456aA") + " 123456aA");

    }

    private static boolean check(String pass) {

        if (pass.length() < 8 |
                !pass.matches(".*\\d.*") |
                !pass.matches(".*[A-Z].*") |
                !pass.matches(".*[a-z].*")) return false;
        else return true;

    }

}

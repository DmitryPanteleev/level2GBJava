package lesson3;

import lesson3.arrayCountWord.CheckPass;
import lesson3.arrayCountWord.LogicCountWord;
import lesson3.arrayCountWord.PhoneBook;

public class MainLesson3 {

    public static void main(String[] args) {

        LogicCountWord.start(100);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Пантелеев", 12345678);
        phoneBook.add("Пантелеев2", 12345678);
        phoneBook.add("Пантелеев", 87654321);
        System.out.print("\nПо запрашеваемой фамилии найдены номера: " + phoneBook.getPhone("Пантелеев")+"\n\n");

        CheckPass.start();
    }

}

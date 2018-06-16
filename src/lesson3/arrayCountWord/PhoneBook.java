package lesson3.arrayCountWord;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    List<ArrayList> phoneBook = new ArrayList();

    public void add(String familia, Integer phoneNumber) {

        if (getPhone(familia) != null) {

            for (int i = 0; i < phoneBook.size(); i++) {
                if (phoneBook.get(i).contains(familia)) {
                    phoneBook.get(i).add(phoneNumber);
                    break;
                }
            }
        } else {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(familia);
            arrayList.add(phoneNumber);
            phoneBook.add(arrayList);
        }
    }

    public ArrayList<ArrayList> getPhone(String familia) {
        for (int i = 0; i < phoneBook.size(); i++) {

            if (phoneBook.get(i).contains(familia)) return (phoneBook.get(i));

        }
        return null;
    }

}

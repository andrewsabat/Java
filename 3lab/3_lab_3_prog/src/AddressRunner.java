import java.util.ArrayList;

import static java.util.Collections.sort;

public class AddressRunner {
    public static void main(String[] args) {
        ArrayList<Address> list = new ArrayList<>();
        TransliteratedAddress firstTransliteratedAddress = new TransliteratedAddress("35687, Винница, Пирогова, 41, 7");
        TransliteratedAddress secondTransliteratedAddress = new TransliteratedAddress("35645, Киев, Хрещатик, 25, 3");
        Address thirdTransliteratedAddress = new Address("21645, Donetsk, Sadoviy, 31, 6");

        list.add(firstTransliteratedAddress);
        list.add(secondTransliteratedAddress);
        list.add(thirdTransliteratedAddress);

        sort(list);

        for (Object a : list) {
            System.out.println(a);
        }

        System.out.println("===========================");

        for (Object a : list) {
            System.out.println(a.getClass());
        }

        System.out.println("===========================");

        System.out.println("A common part of [" + firstTransliteratedAddress + "] and [" + secondTransliteratedAddress + "]");
        System.out.println("[" + firstTransliteratedAddress.stringIntersect(secondTransliteratedAddress) + "]");

        System.out.println("===========================");
    }
}

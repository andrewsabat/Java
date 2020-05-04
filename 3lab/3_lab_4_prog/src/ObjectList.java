import java.util.ArrayList;

public class ObjectList {
    public static void main(String[] args) {
        ArrayList<Address> list = new ArrayList<>();
        TransliteratedAddress firstTransliteratedAddress = new TransliteratedAddress("35687, Винница, Пирогова, 41, 7");
        TransliteratedAddress secondTransliteratedAddress = new TransliteratedAddress("35645, Киев, Хрещатик, 25, 3");
        Address thirdTransliteratedAddress = new Address("21645, Donetsk, Sadoviy, 31, 6");

        //  Додавання елементів у список
        list.add(firstTransliteratedAddress);
        list.add(secondTransliteratedAddress);
        list.add(thirdTransliteratedAddress);

        //  Вивід списка на екран
        for (Object a : list) {
            System.out.println(a);
        }

        System.out.println("===========================");

        //  Видалення елементу зі списока
        list.remove(thirdTransliteratedAddress);

        //  Вивід списка на екран
        for (Object a : list) {
            System.out.println(a);
        }

    }
}

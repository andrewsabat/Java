import java.util.*;

public class Address implements Comparable<Address> {
    String str;
    int index = 0;
    String city;
    String street;
    int houseNum = 0;
    int apartmentNum = 0;

    Address() {
    }

    Address(String s) {
        this.str = s;
        s = s.replaceAll(" ", "");
        String[] splittedString = s.split(",");
        if (splittedString.length < 4) {
            this.city = splittedString[0];
            this.street = splittedString[1];
            this.houseNum = Integer.parseInt(splittedString[2]);
        } else {
            this.index = Integer.parseInt(splittedString[0]);
            this.city = splittedString[1];
            this.street = splittedString[2];
            this.houseNum = Integer.parseInt(splittedString[3]);
            this.apartmentNum = Integer.parseInt(splittedString[4]);
        }
    }

    Address(Address a) {
        this(a.str);
    }

    public String stringIntersect(Address anotherAddress) {
        String commonPart = "";
        int smallestString = Math.min(anotherAddress.toString().length(), this.toString().length());
        for (int i = 0; i < smallestString; i++) {
            if (anotherAddress.toString().charAt(i) == this.toString().charAt(i)) {
                commonPart += (anotherAddress.toString().charAt(i));
            } else {
                commonPart += (" ");
            }
        }
        return commonPart;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override
    public Object clone() {
        return new Address(this);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + index;
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + houseNum;
        result = prime * result + apartmentNum;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return index + ", " + street + ", " + houseNum + ", " + city;

    }

    @Override
    public int compareTo(Address anotherAddress) {
        Character[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
                'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z', 'а', 'б', 'в', 'г', 'д', 'е', 'ё',
                'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т',
                'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        ArrayList<Character> alphabet = new ArrayList<Character>(Arrays.asList(letters));
        //  Для городов
        if (alphabet.indexOf(Character.toLowerCase(this.city.charAt(0))) < alphabet.indexOf(Character.toLowerCase(anotherAddress.city.charAt(0)))) {
            return -1;
        } else if (alphabet.indexOf(Character.toLowerCase(this.city.charAt(0))) == alphabet.indexOf(Character.toLowerCase(anotherAddress.city.charAt(0)))) {
            return 0;
        } else if (alphabet.indexOf(Character.toLowerCase(this.city.charAt(0))) > alphabet.indexOf(Character.toLowerCase(anotherAddress.city.charAt(0)))) {
            return 1;
        }
        //  Для улиц
        /*if (alphabet.indexOf(Character.toLowerCase(this.street.charAt(0))) < alphabet.indexOf(Character.toLowerCase(anotherAddress.street.charAt(0)))) {
            return -1;
        }
        else if (alphabet.indexOf(Character.toLowerCase(this.street.charAt(0))) == alphabet.indexOf(Character.toLowerCase(anotherAddress.street.charAt(0)))) {
            return 0;
        }
        else if (alphabet.indexOf(Character.toLowerCase(this.street.charAt(0))) > alphabet.indexOf(Character.toLowerCase(anotherAddress.street.charAt(0)))) {
            return 1;
        }*/
        return 0;
    }
}

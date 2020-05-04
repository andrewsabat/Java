import java.util.HashMap;

class TransliteratedAddress extends Address {
    HashMap<String, String> rusToEngLetters = new HashMap<String, String>() {{
        put("а", "a");
        put("б", "b");
        put("в", "v");
        put("г", "g");
        put("д", "d");
        put("е", "e");
        put("ё", "e");
        put("ж", "zh");
        put("з", "z");
        put("и", "i");
        put("й", "i");
        put("к", "k");
        put("л", "l");
        put("м", "m");
        put("н", "n");
        put("о", "o");
        put("п", "p");
        put("р", "r");
        put("с", "s");
        put("т", "t");
        put("у", "u");
        put("ф", "f");
        put("х", "h");
        put("ц", "ts");
        put("ч", "ch");
        put("ш", "sh");
        put("щ", "sch");
        put("ъ", "");
        put("ы", "i");
        put("ь", "'");
        put("э", "e");
        put("ю", "yu");
        put("я", "ya");
        put("А", "A");
        put("Б", "B");
        put("В", "V");
        put("Г", "G");
        put("Д", "D");
        put("Е", "E");
        put("Ё", "E");
        put("Ж", "Zh");
        put("З", "Z");
        put("И", "I");
        put("Й", "I");
        put("К", "K");
        put("Л", "L");
        put("М", "M");
        put("Н", "N");
        put("О", "O");
        put("П", "P");
        put("Р", "R");
        put("С", "S");
        put("Т", "T");
        put("У", "U");
        put("Ф", "F");
        put("Х", "H");
        put("Ц", "Ts");
        put("Ч", "Ch");
        put("Ш", "Sh");
        put("Щ", "Sch");
        put("Ъ", "");
        put("Ы", "I");
        put("Ь", "'");
        put("Э", "E");
        put("Ю", "Yu");
        put("Я", "Ya");
    }};

    TransliteratedAddress(String s) {
        super(s);
    }

    @Override
    public String toString() {
        String transliteratedString = "";
        String[] splittedAddress = super.str.split("");
        for (int i = 0; i < splittedAddress.length; i++) {
            if (rusToEngLetters.containsKey(splittedAddress[i])) {
                transliteratedString += rusToEngLetters.get(splittedAddress[i]);
            } else {
                transliteratedString += splittedAddress[i];
            }
        }
        return transliteratedString;
    }
}

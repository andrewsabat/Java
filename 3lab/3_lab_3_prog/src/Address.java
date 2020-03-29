// in process...
public class Address {
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
    }

    Address(Address a) {
        this(a.str);
    }

    public static void main(String[] args) {
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
        result = prime * result + ((index == 0) ? 0 : city.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + houseNum;
        result = prime * result + apartmentNum;
        result = prime * result + ((city == null) ? 0 : city.hashCode());


        return result;
    }

    @Override
    public String toString() {
        return index + " " + street + " " + houseNum + " " + city;

    }
}

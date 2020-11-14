package main.java.uebung1.hotel;

public class Hotel {
    // Integer id;
    String name;
    String city;

    public Hotel(Integer id, String name, String city) {
        // this.id = id;
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
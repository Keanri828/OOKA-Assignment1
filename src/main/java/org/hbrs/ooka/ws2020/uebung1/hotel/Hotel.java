package org.hbrs.ooka.ws2020.uebung1.hotel;

public class Hotel {
    // Integer id;
    private String name;
    private String city;

    public Hotel(String name, String city) {
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

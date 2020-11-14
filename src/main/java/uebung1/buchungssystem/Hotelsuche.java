package main.java.uebung1.buchungssystem;

import main.java.uebung1.hotel.Hotel;

public interface Hotelsuche {
    Hotel[] getHotelByName(String name);
    void openSession();
    void closeSession();
}

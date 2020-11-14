package main.java.uebung1.buchungssystem;

import main.java.uebung1.hotel.Hotel;

public interface Hotelsuche {
    public Hotel[] getHotelByName(String name);
}

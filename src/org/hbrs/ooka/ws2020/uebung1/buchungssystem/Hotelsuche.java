package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

public interface Hotelsuche {
    Hotel[] getHotelByName(String name);
    void openSession();
    void closeSession();
}

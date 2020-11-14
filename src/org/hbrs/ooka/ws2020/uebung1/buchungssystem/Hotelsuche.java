package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public interface Hotelsuche {
    Hotel[] getHotelByName(String name);
    void openSession();
    void closeSession();
}

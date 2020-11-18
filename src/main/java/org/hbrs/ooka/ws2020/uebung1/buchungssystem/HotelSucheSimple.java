package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public interface HotelSucheSimple extends Hotelsuche {
    public Hotel[] getHotelsByName(String name);
}

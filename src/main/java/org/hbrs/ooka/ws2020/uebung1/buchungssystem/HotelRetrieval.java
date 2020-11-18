package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public class HotelRetrieval implements Hotelsuche {
    Caching c_port;

    public HotelRetrieval(Caching c_port) {
        this.c_port = c_port;
    }

    @Override
    public Hotel[] getHotelByName(String name) {


        return new Hotel[0];
    }
}

package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public class HotelSuchePort implements Hotelsuche{
    HotelRetrieval hotelRetrievalObject;

    public HotelSuchePort(HotelRetrieval h) {
        this.hotelRetrievalObject = h;
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        return new Hotel[0];
    }

}

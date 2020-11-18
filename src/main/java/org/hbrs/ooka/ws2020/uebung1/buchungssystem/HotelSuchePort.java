package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public class HotelSuchePort implements HotelSucheExtended, HotelSucheSimple{
    HotelRetrieval hotelRetrievalObject;

    public HotelSuchePort(HotelRetrieval h) {
        this.hotelRetrievalObject = h;
    }

    @Override
    public Hotel[] getHotelsByName(String name) {
        return new Hotel[0];
    }

    @Override
    public void openSession() {
        hotelRetrievalObject.openSession();
    }

    @Override
    public void closeSession() {
        hotelRetrievalObject.closeSession();
    }

    @Override
    public Hotel[] getHotelsExtendedSearch(KeyValuePair[] params) {
        return new Hotel[0];
    }
}

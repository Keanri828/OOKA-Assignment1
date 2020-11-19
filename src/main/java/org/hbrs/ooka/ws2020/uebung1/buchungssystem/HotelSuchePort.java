package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public class HotelSuchePort implements HotelSucheExtended, HotelSucheSimple {
    HotelRetrieval hotelRetrievalObject;
    Logging l;

    public HotelSuchePort(HotelRetrieval h, Logging l) {
        this.hotelRetrievalObject = h;
        this.l = l;
    }

    @Override
    public Hotel[] getHotelsByName(String name) {
        KeyValuePair[] params = new KeyValuePair[1];
        params[0] = new KeyValuePair<String>("name", name);
        l.log("getHotelsByName", params);
        return hotelRetrievalObject.getHotelsByName(name);
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

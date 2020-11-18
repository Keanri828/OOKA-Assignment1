package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

import java.security.Key;

public class HotelRetrieval implements HotelSucheSimple, HotelSucheExtended {
    Caching c_port;
    private DBAccess db = new DBAccess(); // own access, only used by this class

    public HotelRetrieval(Caching c_port) {
        this.c_port = c_port;
    }

    @Override
    public void openSession() {
        db.openConnection();
    }

    @Override
    public void closeSession() {
        db.closeConnection();
    }

    @Override
    public Hotel[] getHotelsExtendedSearch(KeyValuePair[] params) {
        return new Hotel[0];
    }

    @Override
    public Hotel[] getHotelsByName(String name) {
        return new Hotel[0];
    }
}

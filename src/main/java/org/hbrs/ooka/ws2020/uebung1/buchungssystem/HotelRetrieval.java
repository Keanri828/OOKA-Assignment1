package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

import java.util.ArrayList;
import java.util.List;

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
        // not implemented yet, currently only for structure purposes
        return new Hotel[0];
    }

    @Override
    public Hotel[] getHotelsByName(String name) {
        // DB Query
        List<String> db_results = db.getObjects(DBAccess.HOTEL, name);

        // Convert DB Query to List of Hotels
        List<Hotel> hotels = new ArrayList<>();
        for (int i = 0; i < db_results.size(); i += 3) {
            hotels.add(new Hotel(db_results.get(i + 1), db_results.get(i + 2)));
        }

        // Convert List to Array (as specified)
        Hotel[] a_hotels = new Hotel[hotels.size()];
        return hotels.toArray(a_hotels);
    }
}

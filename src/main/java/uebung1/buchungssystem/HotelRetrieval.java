package main.java.uebung1.buchungssystem;

import main.java.uebung1.extern.Caching;
import main.java.uebung1.hotel.Hotel;

public class HotelRetrieval implements Hotelsuche {
    DBAccess db;
    Caching c_port;

    public HotelRetrieval(DBAccess db, Caching c_port) {
        this.db = db;
        this.c_port = c_port;
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        return new Hotel[0];
    }

    @Override
    public void openSession() {
        db.openConnection();
    }

    @Override
    public void closeSession() {
        db.closeConnection();
    }
}

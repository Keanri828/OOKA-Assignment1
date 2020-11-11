package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

public class HotelRetrievalPort implements Hotelsuche{
    @Override
    public Hotel[] getHotelByName(String name) {
        return new Hotel[0];
    }

    @Override
    public void openSession() {

    }

    @Override
    public void closeSession() {

    }
    // macht dieser Port als eigene Klasse Sinn oder sollte
    // HotelRetrieval bereits die Port-Klasse sein?

}

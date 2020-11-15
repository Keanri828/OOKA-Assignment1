package main.java.uebung1.buchungssystem;

import main.java.uebung1.hotel.Hotel;

public class HotelRetrievalPort implements Hotelsuche{
    HotelRetrieval hotelRetrievalObject;

    public HotelRetrievalPort(HotelRetrieval h) {
        this.hotelRetrievalObject = h;
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        return new Hotel[0];
    }

}

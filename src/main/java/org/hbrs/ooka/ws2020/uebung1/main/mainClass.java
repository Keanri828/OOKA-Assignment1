package org.hbrs.ooka.ws2020.uebung1.main;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.*;
import org.hbrs.ooka.ws2020.uebung1.extern.Cache;

public class mainClass {
    private Hotelsuche h_search;
    public static void main(String[] args) {
        // init the whole structure


        System.out.println("Hello User!");
    }

    /**
     * Initialize the Application
     */
    private void init_Application() {
        Cache c = new Cache();
        CachePort c_port = new CachePort(c);
        HotelRetrieval hotelRetrievalObject = new HotelRetrieval(c_port);
        HotelSuchePort h_search_port = new HotelSuchePort(hotelRetrievalObject);
    }

    private void test_Application() {

    }
}

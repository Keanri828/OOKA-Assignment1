package org.hbrs.ooka.ws2020.uebung1.main;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.*;
import org.hbrs.ooka.ws2020.uebung1.extern.Cache;

public class mainClass {

    public static void main(String[] args) {
        // init the whole structure
        Hotelsuche h_search_port = init_Application();

        // test the application
        test_Application(h_search_port);
    }

    /**
     * Initialize the Application
     */
    private static Hotelsuche init_Application() {
        Cache c = new Cache();
        CachePort c_port = new CachePort(c);
        HotelRetrieval hotelRetrievalObject = new HotelRetrieval(c_port);
        HotelSuchePort h_search_port = new HotelSuchePort(hotelRetrievalObject);
        return h_search_port;
    }

    /**
     * init_Application with a given Cache
     * @param c Cache
     */
    private static void init_Application(Cache c) {
        CachePort c_port = new CachePort(c);
        HotelRetrieval hotelRetrievalObject = new HotelRetrieval(c_port);
    }

    private static void test_Application(Hotelsuche h_search) {

    }
}

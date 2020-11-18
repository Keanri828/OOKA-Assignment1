package org.hbrs.ooka.ws2020.uebung1.main;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.*;
import org.hbrs.ooka.ws2020.uebung1.extern.Cache;
import org.hbrs.ooka.ws2020.uebung1.extern.Logger;
import org.hbrs.ooka.ws2020.uebung1.extern.Logging;

public class mainClass {

    public static void main(String[] args) {
        // init the whole structure
        Hotelsuche h_search_port = init_Application();

        // test the application
        test_Application(h_search_port);
    }

    /**
     * Initialize the Application without Cache, returns the application's "entry point"
     */
    private static Hotelsuche init_Application() {
        CachePort c_port = new CachePort();
        Logging l = new Logger();
        HotelRetrieval hotelRetrievalObject = new HotelRetrieval(c_port);
        return new HotelSuchePort(hotelRetrievalObject, l);
    }

    /**
     * init_Application with a given Cache
     * @param c Cache
     * @return Hotelsuche (HotelSuchePort as entry point)
     */
    private static Hotelsuche init_Application(Cache c) {
        CachePort c_port = new CachePort(c);
        HotelRetrieval hotelRetrievalObject = new HotelRetrieval(c_port);
        Logging l = new Logger();
        return new HotelSuchePort(hotelRetrievalObject, l);
    }

    private static void test_Application(Hotelsuche h_search) {

    }
}

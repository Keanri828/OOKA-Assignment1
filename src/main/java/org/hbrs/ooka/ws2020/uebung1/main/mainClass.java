package org.hbrs.ooka.ws2020.uebung1.main;

import org.hbrs.ooka.ws2020.uebung1.buchungssystem.*;
import org.hbrs.ooka.ws2020.uebung1.extern.Cache;
import org.hbrs.ooka.ws2020.uebung1.extern.Logger;
import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public class mainClass {

    public static void main(String[] args) {
        if (args.length == 0) {
            // TESTING TIME! ;)
            // init the whole structure
            Hotelsuche h_search_port = init_Application();

            // test the application
            System.out.println("Testing Application without Cache...");
            test_Application((HotelSucheSimple) h_search_port);

            // init the whole structure with a Cache for testing
            System.out.println("Testing Application with Cache...");
            h_search_port = init_Application(Cache.getInstance());
            test_Application((HotelSucheSimple) h_search_port);
        } else {
            // only uses the first given name
            Hotelsuche h_search_port = init_Application(Cache.getInstance());
            search_args((HotelSucheSimple) h_search_port, args[0]);
        }
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

    private static void test_Application(HotelSucheSimple h_search) {
        h_search.openSession();

        Hotel[] results = h_search.getHotelsByName("Hotel");
        for (Hotel result : results) {
            System.out.println(result);
        }

        // mainly for Cache-testing
        results = h_search.getHotelsByName("Hotel");
        for (Hotel result : results) {
            System.out.println(result);
        }

        h_search.closeSession();
    }

    private static void search_args(HotelSucheSimple h_search, String name) {
        h_search.openSession();
        Hotel[] hotels = h_search.getHotelsByName(name);
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
        h_search.closeSession();
    }
}

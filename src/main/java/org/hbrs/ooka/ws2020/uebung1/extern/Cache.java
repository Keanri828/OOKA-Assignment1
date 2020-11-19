package org.hbrs.ooka.ws2020.uebung1.extern;

import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cache implements Caching {
    private static Cache c = new Cache();
    private HashMap<String, List<Hotel>> cache= new HashMap<String, List<Hotel>>();

    public static Cache getInstance() {
        return c;
    }

    private Cache(){}

    @Override
    public void cacheResult(String key, List<Hotel> value) {
        cache.put(key, value);
    }

    @Override
    public List<Hotel> getEntry(String key) {
        List<Hotel> entry = cache.get(key);
        if (entry == null) {
            // if no mapping exists
            return new ArrayList<Hotel>();
        }
        return entry;
    }
}

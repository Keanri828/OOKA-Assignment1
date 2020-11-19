package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

import java.util.ArrayList;
import java.util.List;

public class CachePort implements Caching {
    private Caching cache = null;

    public CachePort() {
        // to offer the possibility to continue without providing a cache
    }

    public CachePort(Caching c) {
        this.cache = c;
    }

    @Override
    public void cacheResult(String key, List<Hotel> value) {
        if (cache != null) {
            cache.cacheResult(key, value);
        }
    }

    @Override
    public List<Hotel> getEntry(String key) {
        if (cache != null) {
            return cache.getEntry(key);
        }
        else return new ArrayList<Hotel>();
    }
}

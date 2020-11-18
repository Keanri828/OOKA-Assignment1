package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;

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
    public void cacheResult(String key, List<Object> value) {

    }
}

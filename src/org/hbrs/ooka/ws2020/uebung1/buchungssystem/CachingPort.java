package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;

import java.util.List;

public class CachingPort implements Caching{
    private Caching cache = null;

    public CachingPort() {
        // allow empty constructor
    }

    public CachingPort(Caching c) {
        this.cache = c;
    }

    @Override
    public void cacheResult(String key, List<Object> value) {

    }
}

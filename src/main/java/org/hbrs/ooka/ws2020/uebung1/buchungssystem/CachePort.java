package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.extern.Caching;
import org.hbrs.ooka.ws2020.uebung1.extern.Logger;
import org.hbrs.ooka.ws2020.uebung1.extern.Logging;
import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;

import java.util.List;

public class CachePort implements Caching, Logging {
    private Caching cache = null;
    private Logger l;

    public CachePort(Logger l) {
        this.l = l;
    }

    public CachePort(Caching c) {
        this.cache = c;
    }

    @Override
    public void cacheResult(String key, List<Object> value) {

    }

    @Override
    public void log(String method_name, KeyValuePair[] params) {

    }
}

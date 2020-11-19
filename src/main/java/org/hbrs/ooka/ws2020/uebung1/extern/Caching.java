package org.hbrs.ooka.ws2020.uebung1.extern;

import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

import java.util.List;

public interface Caching {
    public void cacheResult(String key, List<Hotel> value);
    public List<Hotel> getEntry(String key);
}

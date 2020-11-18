package org.hbrs.ooka.ws2020.uebung1.buchungssystem;

import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;
import org.hbrs.ooka.ws2020.uebung1.hotel.Hotel;

public interface HotelSucheExtended extends Hotelsuche {
    public Hotel[] getHotelsExtendedSearch(KeyValuePair[] params);
}

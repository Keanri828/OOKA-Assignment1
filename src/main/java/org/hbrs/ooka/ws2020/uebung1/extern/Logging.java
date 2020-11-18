package org.hbrs.ooka.ws2020.uebung1.extern;

import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;

public interface Logging {
    public void log(String method_name, KeyValuePair[] params);
}

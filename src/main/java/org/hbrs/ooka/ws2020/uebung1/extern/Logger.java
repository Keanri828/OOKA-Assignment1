package org.hbrs.ooka.ws2020.uebung1.extern;

import org.hbrs.ooka.ws2020.uebung1.helpers.KeyValuePair;

import java.util.Calendar;

public class Logger implements Logging {

    @Override
    public void log(String method_name, KeyValuePair[] params) {
        Calendar date = Calendar.getInstance();
        String paramString = "";

        for (KeyValuePair param : params) {
            paramString = paramString.concat(param.getKey() + "=" + param.getValue().toString() + ", ");
        }

        System.out.println(date.toString() + ": Zugriff auf Buchungssystem über Methode " +
                method_name + " mit folgenden Parametern: " + paramString);
    }
}

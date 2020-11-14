package main.java.uebung1.extern;

import java.util.ArrayList;
import java.util.Calendar;

public class Logger implements Logging {

    @Override
    public void log(String method_name, String[] params, String[] param_values) {
        Calendar date = Calendar.getInstance();
        ArrayList<String> param_value_pairs = new ArrayList<>();

        try {
            for (int i=0; i < params.length; i++) {
                param_value_pairs.add(params[i] + " = " + param_values[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Länge der Parameter und der zugehörigen Werte stimmen nicht " +
                    "überein.");
        }

        System.out.println(date.toString() + ": Zugriff auf Buchungssystem über Methode " +
                method_name + " mit folgenden Parametern: ");
    }
}

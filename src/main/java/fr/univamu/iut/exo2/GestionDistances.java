package fr.univamu.iut.exo2;

import java.util.HashMap;

public class GestionDistances {
    public static void GestionDistances(){}
    public static HashMap<String, Integer> Cities;

    static {
        Cities = new HashMap<String, Integer>();
        Cities.put("Barcelone", 183);
        Cities.put("Valence", 337);
        Cities.put("Alicante", 399);
        Cities.put("Malaga", 599);
    }

        public static Integer getDistance(String city){
            return Cities.get(city);
    }
}

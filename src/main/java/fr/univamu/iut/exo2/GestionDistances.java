package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.util.HashMap;
import java.util.TreeSet;
import java.util.Comparator;


public class GestionDistances {
    public static void GestionDistances() {}
        public static HashMap<String, Integer> Cities;
        static {
            Cities = new HashMap<String, Integer>();
            Cities.put("Barcelone", 183);
            Cities.put("Valence", 337);
            Cities.put("Alicante", 399);
            Cities.put("Malaga", 599);

        }
    public static Comparator<Conteneur> comparator = new Comparator<Conteneur>() {
        @Override
        public int compare(Conteneur c1, Conteneur c2) {
            return c1.getDistance().compareTo(c2.getDistance());
        }
    };




}


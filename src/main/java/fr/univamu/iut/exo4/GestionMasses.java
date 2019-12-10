package fr.univamu.iut.exo4;

import fr.univamu.iut.Conteneur;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GestionMasses {
    public static Comparator<Conteneur> comparator = new Comparator<Conteneur>() {
        @Override
        public int compare(Conteneur c1, Conteneur c2) {
            return c1.getMasse().compareTo(c2.getMasse());
        }

    PriorityQueue<Conteneur> pQueue =
            new PriorityQueue<Conteneur>(comparator);
            pQueue.addAll(GestionExpeditions.charger("Conteneurs.ser"))


}

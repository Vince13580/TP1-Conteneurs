package fr.univamu.iut.exo2;

import fr.univamu.iut.Conteneur;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.util.Comparator;
import java.util.TreeSet;


public class Lecteur {
    public static Collection<Conteneur> charger(String fichier) {

        TreeSet<Conteneur> sortedconteneur = new TreeSet<Conteneur>(GestionDistances.comparator);

        try {
            FileInputStream fis = new FileInputStream(fichier);
            ObjectInputStream ois = new ObjectInputStream(fis);
            try {
                Conteneur c;
                while (true) {
                    Object o = ois.readObject();
                    if (o.getClass().equals(Conteneur.class)) {
                        c = (Conteneur) o;
                        sortedconteneur.add(c);
                    }
                }
            } catch (EOFException e) {

            } catch (ClassNotFoundException | IOException e) {
                System.out.println("e: " + e.getMessage());
            }
        } catch ( IOException exception ) {
            System.err.println( "Cannot read objects from the stream" );
            exception.printStackTrace();
        }
        return sortedconteneur;
    }

}

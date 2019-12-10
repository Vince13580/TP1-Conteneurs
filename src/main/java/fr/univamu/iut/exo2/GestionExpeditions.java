package fr.univamu.iut.exo2;


import fr.univamu.iut.Conteneur;

import java.util.Collection;
import java.util.HashMap;

public class GestionExpeditions {
    public static void main(String[] args) {
        Collection<Conteneur> conteneurs = Lecteur.charger("Conteneurs.ser");
        System.out.println(conteneurs);



        //throw new RuntimeException("Not yet implemented !");
    }
}

package composite.exercice;

import iterator.arbre.Arbre;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fichier fichier1 = new Fichier("fichier1", 20);
        Fichier fichier2 = new Fichier("fichier2", 30);
        Fichier fichier3 = new Fichier("fichier3", 10);

        Dossier dossier1 = new Dossier("dossier1");
        Dossier dossier2 = new Dossier("dossier2");

        dossier1.addSousDosser(dossier2);
        dossier1.addFichier(fichier1);

        dossier2.addFichier(fichier2);
        dossier2.addFichier(fichier3);

        // calculer poids dossier => utiliser le design patter composite pour calculer le poids d'un dossier
        //int tailleTotal = calculerPoidsDossier(dossier1);
        int tailleTotal = dossier1.getTaille();
        System.out.println(tailleTotal);

        System.out.println(fichier1.getTaille());
    }

    // private static int calculerPoidsDossier(Dossier dossier1) {
    //     List<Dossier> dossiersATraiter = new ArrayList<>();
    //     dossiersATraiter.add(dossier1);
    //     int tailleTotal = 0;
    //     while (!dossiersATraiter.isEmpty()) {
    //         Dossier dossier = dossiersATraiter.remove(0);
    //         for (Fichier fichier : dossier.getFichiers()) {
    //             tailleTotal += fichier.getTaille();
    //         }
    //         dossiersATraiter.addAll(dossier.getSousDossiers());
    //     }
    //     return tailleTotal;
    // }
}

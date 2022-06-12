package iterator.listechainee;

import iterator.Plateau;
import iterator.PlateauIterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListeChainee listeChainee = new ListeChainee();
        listeChainee.add("a");
        listeChainee.add("b");
        listeChainee.add("c");

        //Noeud n = listeChainee.getDebut();
        //while (n != null) {
        //    System.out.println(n.getValeur());
        //    n = n.getSuivant();
        //}

        traitementQuiBoucleSurUneStructure(listeChainee);

        String[][] echiquer = new String[8][8];
        echiquer[0][1] = "T";
        echiquer[0][2] = "C";
        echiquer[0][3] = "F";
        Plateau plateau = new Plateau(echiquer);
        traitementQuiBoucleSurUneStructure(plateau);

    }

    private static void traitementQuiBoucleSurUneStructure(Iterable iterable) {
        for (Iterator iterator = iterable.iterator(); iterator.hasNext(); ) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}

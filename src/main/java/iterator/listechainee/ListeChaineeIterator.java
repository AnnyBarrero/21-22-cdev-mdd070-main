package iterator.listechainee;

import java.util.Iterator;

public class ListeChaineeIterator implements Iterator {

    private Noeud noeudCourant;

    public ListeChaineeIterator(ListeChainee listeChainee) {
        this.noeudCourant = listeChainee.getDebut();
    }

    public boolean hasNext() {
        return noeudCourant != null;
    }

    public String next() {
        String valeur = noeudCourant.getValeur();
        noeudCourant = noeudCourant.getSuivant();
        return valeur;
    }
}

package iterator.listechainee;

public class ListeChainee implements Iterable {
    private Noeud debut;

    public Noeud getDebut() {
        return debut;
    }

    public void add(String a) {
        Noeud noeud = new Noeud(a);
        if (this.debut == null) {
            this.debut = noeud;
        } else {
            Noeud noeudCourant = this.debut;
            while (noeudCourant.getSuivant() != null) {
                noeudCourant = noeudCourant.getSuivant();
            }
            noeudCourant.setSuivant(noeud);
        }
    }

    public ListeChaineeIterator iterator() {
        return new ListeChaineeIterator(this);
    }
}

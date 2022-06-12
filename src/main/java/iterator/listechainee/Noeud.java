package iterator.listechainee;

public class Noeud {

    private String valeur;
    private Noeud suivant;

    public Noeud(String valeur) {
        this.valeur = valeur;
    }

    public Noeud getSuivant() {
        return suivant;
    }

    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    public String getValeur() {
        return valeur;
    }
}

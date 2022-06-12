package iterator.arbre;

public class Arbre {

    private String valeur;
    private Arbre sousArbreGauche;
    private Arbre sousArbreDroit;

    public Arbre(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Arbre{" +
                "valeur='" + valeur + '\'' +
                '}';
    }

    public String getValeur() {
        return valeur;
    }

    public Arbre getSousArbreGauche() {
        return sousArbreGauche;
    }

    public Arbre getSousArbreDroit() {
        return sousArbreDroit;
    }

    public void setSousArbreGauche(Arbre sousArbreGauche) {
        this.sousArbreGauche = sousArbreGauche;
    }

    public void setSousArbreDroit(Arbre sousArbreDroit) {
        this.sousArbreDroit = sousArbreDroit;
    }
}

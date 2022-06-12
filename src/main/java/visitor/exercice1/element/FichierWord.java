package visitor.exercice1.element;

import visitor.exercice1.visitor.Visitor;

public class FichierWord implements Fichier {

    public FichierWord(String nom, String author, int nbPages) {
        this.nom = nom;
        this.author = author;
        this.nbPages = nbPages;
    }

    private String nom;
    private String author;
    private int nbPages;

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getType() {
        return "docx";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForFichierWord(this);
    }

    public String getAuthor() {
        return author;
    }

    public int getNbPages() {
        return nbPages;
    }
}

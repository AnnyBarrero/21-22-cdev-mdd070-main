package visitor.exercice1;


import visitor.exercice1.element.Fichier;
import visitor.exercice1.element.FichierImage;
import visitor.exercice1.element.FichierWord;
import visitor.exercice1.visitor.FichierVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Fichier> fichiers = new ArrayList<>();

        // Calculer les méta data pour chaque fichiers
        for (Fichier fichier : fichiers) {
            MetaDatas metaDatas = calculerMetaData(fichier);
        }


        FichierVisitor fichierVisitor = new FichierVisitor();
        for (Fichier fichier : fichiers) {
            fichier.accept(fichierVisitor);
        }
    }

    private static MetaDatas calculerMetaData(Fichier fichier) {
        MetaDatas metaDatas = new MetaDatas();
        metaDatas.add("nom", fichier.getNom());
        metaDatas.add("type", fichier.getType());
        if (fichier instanceof FichierWord) {
            metaDatas.add("author", ((FichierWord) fichier).getAuthor());
            metaDatas.add("nbPages", ((FichierWord) fichier).getNbPages());
        } else if (fichier instanceof FichierImage) {
            metaDatas.add("hauteur", ((FichierImage) fichier).getHauteur());
            metaDatas.add("largeur", ((FichierImage) fichier).getLargeur());
        }
        return metaDatas;
    }
}

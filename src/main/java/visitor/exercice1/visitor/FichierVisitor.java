package visitor.exercice1.visitor;


import visitor.exercice1.MetaDatas;
import visitor.exercice1.element.Fichier;
import visitor.exercice1.element.FichierImage;
import visitor.exercice1.element.FichierWord;

import java.util.HashMap;
import java.util.Map;

public class FichierVisitor implements Visitor {

    private Map<Fichier, MetaDatas> allMetaDatas = new HashMap<>();

    @Override
    public void doForFichierWord(FichierWord fichierWord) {
        MetaDatas metaDatas = new MetaDatas();
        metaDatas.add("nom", fichierWord.getNom());
        metaDatas.add("type", fichierWord.getType());
        metaDatas.add("author", fichierWord.getAuthor());
        metaDatas.add("nbPages", fichierWord.getNbPages());
        allMetaDatas.put(fichierWord, metaDatas);
    }

    @Override
    public void doForFichierImage(FichierImage fichierImage) {
        MetaDatas metaDatas = new MetaDatas();
        metaDatas.add("nom", fichierImage.getNom());
        metaDatas.add("type", fichierImage.getType());
        metaDatas.add("hauteur", fichierImage.getHauteur());
        metaDatas.add("largeur", fichierImage.getLargeur());
        allMetaDatas.put(fichierImage, metaDatas);
    }

    public MetaDatas getMetaDatas(Fichier fichier) {
        return allMetaDatas.get(fichier);
    }
}

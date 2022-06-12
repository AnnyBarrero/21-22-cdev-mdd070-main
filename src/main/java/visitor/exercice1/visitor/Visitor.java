package visitor.exercice1.visitor;

import visitor.exercice1.element.FichierImage;
import visitor.exercice1.element.FichierWord;

public interface Visitor {

    void doForFichierWord(FichierWord fichierWord);

    void doForFichierImage(FichierImage fichierImage);

}
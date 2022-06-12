package visitor.exercice1.element;

import visitor.exercice1.visitor.Visitor;

public interface Fichier {

    String getNom();
    String getType();

    void accept(Visitor visitor);
}

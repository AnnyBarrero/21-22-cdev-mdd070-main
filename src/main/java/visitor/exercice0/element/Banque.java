package visitor.exercice0.element;

import visitor.exercice0.visitor.Visitor;

public class Banque implements PointDInteret {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForBanque(this);
    }
}

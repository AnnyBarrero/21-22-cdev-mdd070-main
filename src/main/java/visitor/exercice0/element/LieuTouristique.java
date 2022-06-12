package visitor.exercice0.element;

import visitor.exercice0.visitor.Visitor;

public class LieuTouristique implements PointDInteret {
    @Override
    public void accept(Visitor visitor) {
        visitor.doForLieuTouristique(this);
    }
}

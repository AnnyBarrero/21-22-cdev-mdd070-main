package visitor.exercice0.element;

import visitor.exercice0.visitor.Visitor;

public class StationService implements PointDInteret {

    public double getPrixEssence() {
        return 0;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForStationService(this);
    }
}

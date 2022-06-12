package visitor.exercice0;

import visitor.exercice0.element.Banque;
import visitor.exercice0.element.PointDInteret;
import visitor.exercice0.element.StationService;
import visitor.exercice0.visitor.TouristeVisitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PointDInteret> guideTouristique = new ArrayList<>();
        for (PointDInteret pointDInteret : guideTouristique) {
            if (pointDInteret instanceof Banque) {
                Banque banque = (Banque) pointDInteret;
                // banque
            }
            if (pointDInteret instanceof StationService) {
                StationService stationService = (StationService) pointDInteret;
                stationService.getPrixEssence();
                // stationService
            }
            //...
        }

        TouristeVisitor touristeVisitor = new TouristeVisitor();
        for (PointDInteret pointDInteret : guideTouristique) {
            pointDInteret.accept(touristeVisitor);
        }
    }
}

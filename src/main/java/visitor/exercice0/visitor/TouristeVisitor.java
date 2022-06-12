package visitor.exercice0.visitor;

import visitor.exercice0.element.Banque;
import visitor.exercice0.element.LieuTouristique;
import visitor.exercice0.element.StationService;

public class TouristeVisitor implements Visitor {
    @Override
    public void doForBanque(Banque banque) {
        // je m'en fou
    }

    @Override
    public void doForStationService(StationService stationService) {
        // je m'en fou
    }

    @Override
    public void doForLieuTouristique(LieuTouristique lieuTouristique) {
        // ajouter ce lieu à mes favoris.
    }
}

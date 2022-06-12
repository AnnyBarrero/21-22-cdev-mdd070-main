package visitor.exercice0.visitor;

import visitor.exercice0.element.Banque;
import visitor.exercice0.element.LieuTouristique;
import visitor.exercice0.element.StationService;

public interface Visitor {
    void doForBanque(Banque banque);

    void doForStationService(StationService stationService);

    void doForLieuTouristique(LieuTouristique lieuTouristique);
}

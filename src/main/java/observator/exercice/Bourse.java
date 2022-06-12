package observator.exercice;


import java.util.ArrayList;
import java.util.List;


public class Bourse {

    private List<BourseSubscriber> bourseSubscribers = new ArrayList<>();
    private int prixBTC;

    public void setPrixBTC(int prixBTC) {
        this.prixBTC = prixBTC;
        for (BourseSubscriber bourseSubscriber : bourseSubscribers) {
            bourseSubscriber.update(prixBTC);
        }
    }

    public int getPrixBTC() {
        return prixBTC;
    }

    public void subscribe(BourseSubscriber subscriber) {
        this.bourseSubscribers.add(subscriber);
    }

    public void unsubscribe(BourseSubscriber subscriber) {
        this.bourseSubscribers.remove(subscriber);
    }
}

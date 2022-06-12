package observator.exercice;

public class TraderQuiVeutAcheter implements BourseSubscriber {
    @Override
    public void update(int prix) {
        if (prix < 25_000) {
            System.out.println("Acheter du BTC !!!! car il vaut " + prix);
        }
    }
}

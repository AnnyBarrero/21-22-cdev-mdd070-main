package observator.exercice;

public class TraderQuiVeutVendre implements BourseSubscriber {
    @Override
    public void update(int prix) {
        if (prix > 32_000) {
            System.out.println("Je vends du BTC !!!! car il vaut " + prix);
        }
    }
}

package observator.exercice;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bourse bourse = new Bourse();

        BourseSubscriber acheteur = new TraderQuiVeutAcheter();
        bourse.subscribe(acheteur);

        BourseSubscriber vendeur = new TraderQuiVeutVendre();
        bourse.subscribe(vendeur);

        while (true) {

            // aléatoirement le prix du BTC évolue
            // Nombre aléatoire entre -5000 et 5000
            int random = (new Random().nextInt(10_000) - 5000);
            bourse.setPrixBTC(28_396 + random);

            // double p = bourse.getPrixBTC();
            // if (p < 25_000) {
            //     System.out.println("Acheter du BTC !!!! car il vaut " + p);
            //     return;
            // } else if (p > 32_000) {
            //     System.out.println("Je vends du BTC !!!! car il vaut " + p);
            //     return;
            // } else {
            // System.out.println("c'est trop cher il vaut mieux attendre");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // }
        }
    }

}

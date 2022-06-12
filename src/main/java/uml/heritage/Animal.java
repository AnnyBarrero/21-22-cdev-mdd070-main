package uml.heritage;

public class Animal {
    private double poids;

    public void manger(double nourritureEnGramme) {
        this.poids = this.poids + nourritureEnGramme;
    }
}

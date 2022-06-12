package iterator;

public class Plateau implements Iterable<String> {

    private String[][] echiquier = new String[8][8];

    public Plateau(String[][] echiquier) {
        this.echiquier = echiquier;
    }

    public PlateauIterator iterator() {
        return new PlateauIterator(this);
    }

    public String[][] getEchiquier() {
        return echiquier;
    }
}


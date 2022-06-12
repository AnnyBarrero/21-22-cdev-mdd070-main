package iterator;

import java.util.Iterator;

public class PlateauIterator implements Iterator<String> {

    private final String[][] echiquier;
    private int x = 0;
    private int y = 0;

    public PlateauIterator(Plateau plateau) {
        echiquier = plateau.getEchiquier();
    }

    @Override
    public String next() {
        String valeur = echiquier[x][y];
        if (y < echiquier.length ) {
            y++;
        } else {
            y = 0;
            x++;
        }
        return valeur;
    }

    @Override
    public boolean hasNext() {
        return x < echiquier.length
                && y < echiquier[x].length;
    }
}
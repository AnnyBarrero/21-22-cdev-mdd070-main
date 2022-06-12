package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("T");
        list.add("C");
        list.add("F");

        for (int i = 0; i < list.size(); i++) {
            String element = list.get(i);
            System.out.println(element);
        }
    }

    public static void main2(String[] args) {
        String[][] echiquer = new String[8][8];

        echiquer[0][1] = "T";
        echiquer[0][2] = "C";
        echiquer[0][3] = "F";

        for (int i = 0; i < echiquer.length; i++) {
            for (int j = 0; j < echiquer[i].length; j++) {
                String element = echiquer[i][j];
                System.out.println(element);
            }
        }
    }

    public static void main3(String[] args) {
        String[][] echiquer = new String[8][8];

        echiquer[0][1] = "T";
        echiquer[0][2] = "C";
        echiquer[0][3] = "F";
        Plateau plateau = new Plateau(echiquer);
//        plateau.getPiece(1, 2);

        for (PlateauIterator plateauIterator = plateau.iterator(); plateauIterator.hasNext(); ) {
            String element = plateauIterator.next();
            System.out.println(element);
        }

        for (String piece : plateau) {
            System.out.println(piece);
        }

        Iterable<String> it = plateau;
        Iterable<String> it2 = new ArrayList<>();

        printIterable(plateau);
        printIterable(new ArrayList<>());
    }

    static void printIterable(Iterable<String> it) {
        for (String s : it) {
            System.out.println(s);
        }

    }
}

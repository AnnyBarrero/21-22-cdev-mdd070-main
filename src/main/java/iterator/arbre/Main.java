package iterator.arbre;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Arbre a = new Arbre("A");
        Arbre b = new Arbre("B");
        Arbre c = new Arbre("C");
        Arbre d = new Arbre("D");
        Arbre e = new Arbre("E");

        a.setSousArbreGauche(b);
        a.setSousArbreDroit(c);
        b.setSousArbreGauche(d);
        b.setSousArbreDroit(e);

        List<Arbre> list = new ArrayList<>();
        list.add(a);
        while (!list.isEmpty()) {
            Arbre x = list.remove(0);
            System.out.println(x);
            if (x.getSousArbreGauche() != null)
                list.add(x.getSousArbreGauche());
            if (x.getSousArbreDroit() != null)
                list.add(x.getSousArbreDroit());
        }

    }
}

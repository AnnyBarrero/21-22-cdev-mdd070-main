package composite;

public class Main {
    public static void main(String[] args) {
        Soldat soldat1 = new Soldat();
        Soldat soldat2 = new Soldat();
        Soldat soldat3 = new Soldat();

        UniteOperationnelComposite brigade1 = new UniteOperationnelComposite();
        brigade1.add(soldat1);
        brigade1.add(soldat2);
        brigade1.add(soldat3);

        UniteOperationnelComposite brigade2 = new UniteOperationnelComposite();
        //brigade2 a remplir

        UniteOperationnelComposite division = new UniteOperationnelComposite();
        division.add(brigade1);
        division.add(brigade2);

        division.defendre();
    }
}

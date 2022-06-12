package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Sample {
    static void go() {
        main();
        main("1");
        main("1", "1");
        main(new String[]{"1", "1"});
    }

    public static void main(String... args) {
        String arg = args[0];

        //Lambda
        Function<String, Integer> lambda = text -> Integer.parseInt(text);
        MaLambda lambda2 = new MaLambda();

      //  button.onClick(() -> alert("hello"));
      //  button.onClick(new ClickListener() {
      //      void onClick() {
      //          alert("hello");
      //      }
      //  });


        //Généricité
        List list = new ArrayList();
        list.add(0);
        list.add("abc");
        list.add("def");

        Object o = list.get(0);
        ((String) o).length();


        List<String> list2 = new ArrayList();
        // list2.add(0);
        list2.add("abc");
        list2.add("def");

        String o2 = list2.get(0);

    }

    static class MaLambda implements Function<String, Integer> {
        @Override
        public Integer apply(String s) {
            return Integer.parseInt(s);
        }
    }

}

package iterator;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlateauIteratorTest {

    @Test
    void echiquierVide() {
        Plateau plateau = new Plateau(new String[0][0]);
        PlateauIterator iterator = new PlateauIterator(plateau);
        Assertions.assertEquals(iterator.hasNext(), false);
    }

    @Test
    void plateau22() {
        Plateau plateau = new Plateau(new String[][]{
                new String[]{"A", "B", "C"},
                new String[]{"D", "E", "F"}
        });
        PlateauIterator iterator = new PlateauIterator(plateau);
        Assertions.assertEquals(true, iterator.hasNext());
        Assertions.assertEquals("A", iterator.next());

        Assertions.assertEquals(true, iterator.hasNext());
        Assertions.assertEquals("B", iterator.next());

        Assertions.assertEquals(true, iterator.hasNext());
        Assertions.assertEquals("C", iterator.next());

        Assertions.assertEquals(true, iterator.hasNext());
        Assertions.assertEquals("D", iterator.next());

        Assertions.assertEquals(true, iterator.hasNext());
        Assertions.assertEquals("E", iterator.next());

        Assertions.assertEquals(true, iterator.hasNext());
        Assertions.assertEquals("F", iterator.next());

        Assertions.assertEquals(false, iterator.hasNext());
    }
}
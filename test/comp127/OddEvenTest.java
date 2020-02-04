package comp127;

import basicjava.OddEven;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class OddEvenTest {
    @Test
    public void testOddEven() {
        assertEquals(true, OddEven.isOdd(7));
        assertEquals(false, OddEven.isOdd(8));
        assertEquals(true, OddEven.isOdd(-3));
        assertEquals(false, OddEven.isOdd(-4));
    }
}

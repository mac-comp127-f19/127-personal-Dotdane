package comp127;

import basicjava.Hypotenuse;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {
    @Test
    public void testHypotenuse() {
        // Your code goes here
        assertEquals(5.0, Hypotenuse.calculateHypotenuse(3.0,4.0));
    }
}

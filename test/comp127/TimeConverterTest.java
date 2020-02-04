package comp127;

import org.junit.jupiter.api.Test;

import static basicjava.TimeConverter.convertToSeconds;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConverterTest {
    @Test
    public void testTimeConverter() {
        assertEquals(5400, convertToSeconds(1, 30, 0));
        assertEquals(70, convertToSeconds(0, 1, 10));

    }
}

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // test's for Period constructor
    @Test
    void validPeriodConstructor() {
        int start = 2;
        int end = 5;

        Period period = new Period(start, end);
        assertNotNull(period);
    }

    @Test
    void invalidPeriodConstructor() {
        int start = 2;
        int end = 5;

        Period period = null;

        assertNotNull(period);
    }
    // end of test's for Period constructor




    // test's for duration method
    @Test
    void validStartAndEndPeriod() {

        int start = 4;
        int end = 6;

        Period p1 = new Period(start, end);

        assertEquals(p1.duration(), 2);
    }


    @Test
    void checkSameTime() {
        int start = 4;
        int end = 4;

        Period p1 = new Period(start, end);

        assertEquals(p1.duration(), 0);
    }

    @Test
    void invalidPeriod() {
        Period p1 = new Period(-1, 0);
        assertEquals(p1.duration(), -1);
    }

    @Test
    void invalidDuration() {
        int start = 5;
        int end = 12;

        Period period = new Period(start, end);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            period.duration();
        });

        assertEquals(period.duration(), -7, e.getMessage());
    }

    @Test
    void startAndEndHourNotEqualDuration() {
        int start = 2;
        int end = 2;

        Period period = new Period(start, end);

        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> {
            period.duration();
        });

        assertEquals(period.duration(), 6, e.getMessage());
    }
}
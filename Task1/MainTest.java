import org.junit.jupiter.api.Test;
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
}
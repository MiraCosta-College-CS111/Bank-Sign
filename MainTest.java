import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void freezing() {
        assertEquals(0, Main.convertFtoC(32));
    }

    @Test
    void boiling() {
        assertEquals(100, Main.convertFtoC(212));
    }

    @Test
    void same() {
        assertEquals(-40, Main.convertFtoC(-40));
    }

    @Test
    void comfortable() {
        assertEquals(24, Main.convertFtoC(75));
    }

    @Test
    void body() {
        assertEquals(37, Main.convertFtoC(99));
    }

    @Test
    void reallyCold() {
        assertEquals(-18, Main.convertFtoC(0));
    }
}
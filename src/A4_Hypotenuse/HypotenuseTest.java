package A4_Hypotenuse;

import org.junit.Test;

import java.lang.Math;

import static org.junit.Assert.assertEquals;

public class HypotenuseTest {

    @Test
    public void shouldReturnHypotenuse() {
        assertEquals("5.0", hypotenuse(3.0,4.0));
    }

    public static String hypotenuse(double a, double b) {
        return String.valueOf(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    }

}


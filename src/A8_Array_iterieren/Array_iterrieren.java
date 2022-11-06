package A8_Array_iterieren;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array_iterrieren {

    @Test
    public void shouldReturnAccurance() {
        int[] zahlen = {6,1,0,14,7,6,2};
        assertEquals(1, anzahlVorkommen(zahlen, 0));
        assertEquals(0, anzahlVorkommen(zahlen, 3));
        assertEquals(2, anzahlVorkommen(zahlen, 6));
    }

    private int anzahlVorkommen(int[] zahlen, int i) {
        int c = 0; // counter
        for (int j : zahlen) {
            if (j == i) {
                c++;
            }
        }
        return c;
    }

}

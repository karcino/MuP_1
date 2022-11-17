package A7_Fakultät;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fakultät {

    @Test
    public void shouldReturnFakultät() {
        Assert.assertEquals(120, fakultaet(5));
        Assert.assertEquals(1, fakultaet(0));
    }

    private long fakultaet(long i) {
        if (i == 0) {
            return 1;
        } else if (i > 0) {
            long f = 1;
            for (long j = 1; j <= i; j++) {
                f = f * j;
            }
            return f;
        } else {
            return i;
        }
    }


}

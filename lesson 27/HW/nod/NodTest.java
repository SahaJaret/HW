package HW.nod;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import HW.nod.Nod;

public class NodTest {
    private Nod nod;

    @Before
    public void setUp() {
        nod = new Nod();
    }

    @Test
    public void testNod() {

        assertEquals(6, nod.nod(18, 24));
        assertEquals(24, nod.nod(48, 24));
        assertEquals(10, nod.nod(50, 40));

        assertEquals(1, nod.nod(7, 11));
        assertEquals(1, nod.nod(13, 17));

        assertEquals(1, nod.nod(1, 50));
        assertEquals(1, nod.nod(1, 1));
    }
}

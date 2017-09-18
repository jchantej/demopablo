package demopablo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C21Test {
    private C21 c21;

    @Test
    public void testC21m1() {
        c21 = new C21();
        assertEquals("m1", c21.m1());
    }

    @Test
    public void testC21m2() {
        c21 = new C21();
        assertEquals("m2", c21.m2());
    }

}

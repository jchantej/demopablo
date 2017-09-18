package demopablo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C52Test {
    private C52 c52;

    @Test
    public void testC52m1() {
        c52 = new C52();
        assertEquals("mA" ,c52.mA());
    }

}

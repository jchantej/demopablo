package demopablo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C22Test {
    private C22 c22;

    @Test
    public void testC21m1() {
        c22 = new C22();
        assertEquals("mA" ,c22.mA());
    }

}

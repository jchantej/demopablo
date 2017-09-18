package demopablo;

import static org.junit.Assert.*;

import org.junit.Test;

public class C51Test {
    private C51 c51;

    @Test
    public void testC11m1() {
        c51 = new C51();
        assertEquals("m1" ,c51.m1());
    }
    
    @Test
    public void testC11m2() {
        c51 = new C51();
        assertEquals("m2" ,c51.m2());
    }


}

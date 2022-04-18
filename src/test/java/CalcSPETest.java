import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcSPETest extends TestCase {
    CalcSPE calcSPE = new CalcSPE();
    @Test
    public void testRemain() {

        assertEquals(0.0,calcSPE.remain(6,3));
        assertEquals(5.0,calcSPE.remain(5,9));
    }

    @Test
    public void testSub() {
        assertEquals(3.0,calcSPE.sub(6,3));
        assertEquals(-4.0,calcSPE.sub(5,9));
    }

    @Test
    public void testMul() {
        assertEquals(18.0,calcSPE.mul(6,3));
        assertEquals(45.0,calcSPE.mul(5,9));
    }

    @Test
    public void testDiv() {
        assertEquals(2.0,calcSPE.div(6,3));
        assertEquals(3.0,calcSPE.div(9,3));
    }

    @Test
    public void testAdd() {
        assertEquals(15.0,calcSPE.add(10,5));
        assertEquals(115.0,calcSPE.add(111,4));
    }

    @Test
    public void testFact() {
        assertEquals(120.0,calcSPE.fact(5));
        assertEquals(720.0,calcSPE.fact(6));
    }

    @Test
    public void testSqroot() {
        assertEquals(5.0,calcSPE.sqroot(25));
        assertEquals(11.0,calcSPE.sqroot(121));
    }

    @Test
    public void testPower() {
        assertEquals(81.0,calcSPE.power(3,4));
        assertEquals(-125.0,calcSPE.power(-5,3));
    }

    @Test
    public void testNaturallog() {
        assertEquals(2.303,calcSPE.naturallog(10));
        assertEquals(4.007,calcSPE.naturallog(55));
    }
}
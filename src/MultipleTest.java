import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultipleTest{
    @Test
    public void testFirst(){
        Multiple m = new Multiple();
        int res = m.multiSumFor(4, 5);
        assertEquals(20, res);
    }

    @Test
    public void testSecond(){
        Multiple m = new Multiple();
        int res = m.multiLog(4, 5);
        assertEquals(20, res);
    }

    @Test
    public void testThird(){
        Multiple m = new Multiple();
        int res = m.multiRecurs(4, 5);
        assertEquals(20, res);
    }

    @Test
    public void testFourth(){
        Multiple m = new Multiple();
        int res = m.multiSumWhile(4, 5);
        assertEquals(20, res);
    }

    @Test
    public void testFifth(){
        Multiple m = new Multiple();
        int res = m.multiPower(4, 5);
        assertEquals(20, res);
    }
}

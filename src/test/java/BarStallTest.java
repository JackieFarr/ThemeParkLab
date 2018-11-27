import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarStallTest {

    BarStall barstall;
    Visitor visitor;

    @Before
    public void before(){
        barstall = new BarStall("Bill's Booze", "Bill", 8, 8);
        visitor = new Visitor(19, 198, 80);
    }

    @Test
    public void is18OrOlder(){
        assertEquals(true, barstall.isAllowedTo(visitor));
    }
}

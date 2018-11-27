import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("Loopy-Loop", 6, 8.40);
        visitor = new Visitor(16, 220, 23);
    }

    @Test
    public void checkPriceForRide() {
        assertEquals(16.80, rollercoaster.priceFor(visitor), 1);
    }


    @Test
    public void isAllowedTo(){
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }

}
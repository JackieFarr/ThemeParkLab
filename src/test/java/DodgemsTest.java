import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(11, 120, 10);
        dodgems = new Dodgems("Wild Ride", 3, 4.50);
    }

    @Test
    public void checkPriceForRide(){
        assertEquals(2.25, dodgems.priceFor(visitor), 1);
    }
}

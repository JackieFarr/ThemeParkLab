import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StallTest {

    Stall stall;

    @Before
    public void before(){
        stall = new Stall("Bill's Beers", "Billy", 3, 9);
    }

    @Test
    public void hasName(){
        assertEquals("Bill's Beers", stall.getName());
    }

    @Test
    public void hasOwner(){
        assertEquals("Billy", stall.getOwnerName());
    }

    @Test
    public void hasParkingSpot(){
        assertEquals(3, stall.getParkingSpot());
    }
}

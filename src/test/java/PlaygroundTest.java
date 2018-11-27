import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void before(){
        playground = new Playground("Sandy Fun", 6, 0);
        visitor = new Visitor(19, 156, 5);
    }

    @Test
    public void allowedToUse(){
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}

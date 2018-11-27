import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(18, 150, 20);
    }

    @Test
    public void hasAge(){
        assertEquals(18, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(150, visitor.getHeight(), 1);
    }

    @Test
    public void hasMoney(){
        assertEquals(20, visitor.getMoney(), 1);
    }


}

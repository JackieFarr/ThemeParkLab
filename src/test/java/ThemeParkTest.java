import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Rollercoaster rollercoaster;
    Playground playground;
    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
//        themepark = new ThemePark("Fun World");
        dodgems = new Dodgems("Bumpy Cars", 3, 3.80);
        rollercoaster = new Rollercoaster("Loopy Loop", 8, 12);
        playground = new Playground("Sandy Pit", 4, 0);
        candyFlossStall = new CandyFlossStall("Fluffy Fun", "Alice", 3, 2);

        ArrayList<IReviewed> reviews = new ArrayList<>();

        reviews.add(dodgems);
        reviews.add(rollercoaster);
        reviews.add(playground);
        reviews.add(candyFlossStall);


        themePark = new ThemePark("Fun World", reviews);
    }

    @Test
    public void getAllReviews(){
        assertEquals(4, themePark.getAllReviews().size());
    }

}

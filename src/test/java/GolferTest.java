import models.Golfer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GolferTest {
    Golfer golfer;

    @Before
    public void before(){
        golfer = new Golfer("Tiger", "Woods", 42);
    }

    @Test
    public void canGetFirstName(){
        assertEquals("Tiger", golfer.getFirstName());
    }

    @Test
    public void canGetLastName(){
        assertEquals("Woods", golfer.getLastName());
    }

    @Test
    public void canGetAge(){
        assertEquals(42, golfer.getAge());
    }
}

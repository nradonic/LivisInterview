

import static org.junit.Assert.*;

/**
 * Created by NickRadonic on 1/14/16.
 */
public class RectangleTest {

    @org.junit.Test
    public void testArea() throws Exception {
        Rectangle r1 = new Rectangle(5, 4);
        assertEquals(r1.area(), 20, 0);
    }

    @org.junit.Test
    public void testCompareTo() throws Exception {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(4, 5);
        assertTrue(r1.compareTo(r2)== 0);
        assertTrue(r1.area()==19);
    }
}
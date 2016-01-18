/**
 * Created by NickRadonic on 1/14/16.
 */
class RectangleTest extends GroovyTestCase {
    void testArea() {
        Rectangle r = new Rectangle(3,4);
        assertTrue( r.area() == 12  );
    }

    void testCompareTo() {

    }
}

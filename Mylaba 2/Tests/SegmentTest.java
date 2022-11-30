import org.junit.jupiter.api.Assertions;


public class SegmentTest {

    @org.junit.Test
    public void Test1() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4,4);
        Segment line = new Segment(p1,p2);
        Assertions.assertEquals(line.Len(),2,001);

    }
    @org.junit.Test
    public void Test2() {
        Point p1 = new Point(3,3);
        Point p2 = new Point(9,9);
        Segment line = new Segment(p1,p2);
        Assertions.assertEquals(line.Len(),5.99999999999,001);

    }

    @org.junit.Test
    public void Test3() {
        Point p1 = new Point(4, 4);
        Point p2 = new Point(8, 8);
        Segment line = new Segment(p1, p2);
        Assertions.assertEquals(line.Len(), 4.0, 001);
    }

}
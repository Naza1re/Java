import org.junit.jupiter.api.Assertions;
import org.junit.Test;


public class CircleTest {

    @Test
    public void Test1() {
        Point p1 = new Point(2,2);
        Point p2 = new Point(4,4);
        Circle circle = new Circle(p1,p2);
        Assertions.assertEquals(circle.Square(),6.280000000000002,0.001);
    }

    @Test
    public void Test2() {
        Point p1 = new Point(3,3);
        Point p2 = new Point(9,9);
        Circle circle = new Circle(p1,p2);
        Assertions.assertEquals(circle.Square(),56.51999999999999,0.001);
    }

    @Test
    public void Test3() {
        Point p1 = new Point(4,4);
        Point p2 = new Point(8,8);
        Circle circle = new Circle(p1,p2);
        Assertions.assertEquals(circle.Square(),25.120000000000008,0.001);
    }
}
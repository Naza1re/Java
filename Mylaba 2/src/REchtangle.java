public class REchtangle {
    public Point A;
    public Point B;
    public Point D;
    public Point C;

    REchtangle(Point A, Point C)
    {
        this.A = new Point(A.GetX(), A.GetY());
        this.C = new Point(C.GetX(), C.GetY());
    }

    public void Point(Point A, Point C)
    {
        double dy = A.GetY() - C.GetY();
        double dx = C.GetX() - A.GetX();
        double d = (dx - dy) / 2;
        this.D = new Point(A.GetX() + d, C.GetY() - d);
        this.B = new Point(C.GetX() - d, A.GetY() + d);
    }

    public String toString() {
        return "A" + A + "\nB" + B + "\nC" + C + "\nD" + D;
    }



}

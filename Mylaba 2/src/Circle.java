import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Circle {
    public final double D;

    Circle(Point a,Point c){

        this.D = sqrt(pow(c.GetX()-a.GetX(),2)+pow(c.GetY()-a.GetY(),2));
    }
    double Square()
    {
        return pow((D/2),2)*3.14;
    }
    double Dockr()
    {
        return D *3.14;
    }
    double DIM()
    {
        return D;
    }
    double Dyga()
    {
        return D * 3.14 /4;
    }



}

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Segment {

public final double D;
   Segment(Point a,Point c){

   this.D = sqrt(pow(c.GetX()-a.GetX(),2)+pow(c.GetY()-a.GetY(),2));
}
   double Len()
   {
    return D/sqrt(2);
   }
   double Rad()
   {
       return D/2;
   }

   Point GetMidpoint(Point a,Point c)
   {
       return new Point((a.GetX() + c.GetX()) / 2, (a.GetY() + c.GetY()) / 2);
   }

   double PER()
   {
       return D/sqrt(2)*4;
   }




}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   Scanner in = new Scanner(System.in);

   double x1,y1,x2,y2;

   System.out.print("Введите координаты x1,y1 : ");
   x1 = in.nextDouble();
   y1 = in.nextDouble();

   System.out.print("Введите координаты x2,y2 : ");
   x2 = in.nextDouble();
   y2 = in.nextDouble();

   Point A = new Point(x1,y1);
   Point C = new Point(x2,y2);

   Segment line = new Segment(A,C);
   Circle circle = new Circle(A,C);

   System.out.println("Длинна стороны квадрата : "+ line.Len());
   System.out.println("Периметр квдарат : "+ line.PER());
   System.out.println("Радиус окружности описанной вокруг квадрата  : " + line.Rad());

   System.out.println("\nКоордината центра  \n X = : " + line.GetMidpoint(A,C).GetY()+ "\n Y = : " +line.GetMidpoint(A,C).GetX());

   System.out.println("\nПлощадь Окружности описанной вокруг квадрата : " + circle.Square());
   System.out.println("Длинна дуги окружности : " + circle.Dockr());
   System.out.println("Диаметр круга равен : "+ circle.DIM());

   REchtangle REchtangle = new REchtangle(A,C);
   REchtangle.Point(A,C);
   System.out.println("Координаты вершин квадрата");
   System.out.println(REchtangle);







    }
}
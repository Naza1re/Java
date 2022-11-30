public class Main {

    public static double expression(int a, int b, int c) {
        return Math.pow(b,2)-4*a*c;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println(expression(a, b, c));
    }
}
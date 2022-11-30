

public class Main {

    public static void main (String[] args)
    {
        double step = Double.parseDouble(args[0]);
        int segments = (int) (2 * Math.PI / step);
        double[][][] coords = new double[segments][2][2];
        short[][] colors = new short[segments][3];
        for (int i = 0; i < segments; i++)
        {
            double fi = i * step; //угол
            double r1 = (2 - Math.abs(Math.cos((Math.PI + 10 * fi) / 4))) / 2;
            double r2 = Math.tan((Math.PI * (2 + Math.sin(5 * fi))) / 8) / 5;
            coords[i][0][0] = r1 * Math.cos(fi);
            coords[i][0][1] = r1 * Math.sin(fi);
            coords[i][1][1] = Math.cos(r2);
            coords[i][1][1] = Math.sin(r2);

            colors[i][0] = (short) ((30 * i) % 255); //красный
            colors[i][1] = (short) ((20 * i) % 255); //зелёный
            colors[i][2] = (short) ((10 * i) % 255); //синий
        }

        paint(500,500,coords,colors);
    }
}
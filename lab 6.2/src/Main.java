import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Year;

public class Main extends JFrame implements ActionListener {

    private final JFrame frame = new JFrame("lab 6.2");

    private final JButton button = new JButton("Посчитать");

    private final JTextField x1 = new JTextField();

    private final JTextField h1 = new JTextField();

    private final JLabel X = new JLabel("X");

    private final JLabel H = new JLabel("H");

    private final JLabel RES = new JLabel("Результат");

    private final JTextField res = new JTextField();

    private final JTextField res2 = new JTextField();

    Main()
    {
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(100,100,300,300);

        X.setBounds(40,15,100,10);
        H.setBounds(40,45,100,10);
        frame.add(X);
        frame.add(H);


        x1.setBounds(100,10,150,25);
        h1.setBounds(100,40,150,25);
        frame.add(x1);
        frame.add(h1);

        res.setBounds(100,100,150,25);
        RES.setBounds(30,80,100,25);
        frame.add(res);
        frame.add(RES);

        res2.setBounds(100, 70, 150, 25);
        frame.add(res2);

        button.setBounds(125,140,100,50);


        button.addActionListener(this);

        frame.add(button);

    }
    public static int Factorial(int a)
    {
        int b = 1;

        for (int i = 1; i <= a; i++)
        {
            b = b * i;
        }
        return b;
    }

    public static double Exp(double x)
    {
        return Math.exp(x);
    }

    public static double Sum(double x, double h)
    {
        int i=0;
        double res=0;
        double sum=0;
        do
        {
            res = Math.pow(x,i)/Factorial(i);
            sum+=res;
            i++;
        }
        while (Math.abs(res)>=h);
        return sum;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        double x =Double.parseDouble(x1.getText());
        double h =Double.parseDouble(h1.getText());

        res.setText(Double.toString(Sum(x,h)));
        res2.setText(Double.toString(Exp(x)));



    }
    public static void main(String[] args)
    {
        new Main();
    }
}
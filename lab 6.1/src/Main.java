import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



    public class Main extends JFrame implements ActionListener
    {
        private final JFrame frame = new JFrame("Лаба 6(1)");
        private final JButton count = new JButton("Расчёт");
        private final JTextField num_a = new JTextField();
        private final JTextField num_b = new JTextField();
        private final JTextField num_c = new JTextField();
        private final JTextField result = new JTextField();
        private final JLabel A = new JLabel("Число A");
        private final JLabel B = new JLabel("Число B");
        private final JLabel C = new JLabel("Число C");
        private final JLabel Res = new JLabel("Результат");

        Main()
        {
            frame.setVisible(true);
            frame.setLayout(null);
            frame.setBounds(700,400,300,300);

            A.setBounds(40,15,100,10);
            B.setBounds(40,45,100,10);
            C.setBounds(40,75,100,10);
            frame.add(A);
            frame.add(B);
            frame.add(C);

            num_a.setBounds(100,10,100,25);
            num_b.setBounds(100,40,100,25);
            num_c.setBounds(100,70,100,25);
            frame.add(num_a);
            frame.add(num_b);
            frame.add(num_c);

            result.setBounds(100,100,100,25);
            Res.setBounds(40,100,100,25);
            frame.add(result);
            frame.add(Res);

            count.setBounds(100,140,100,50);
            count.addActionListener(this);
            frame.add(count);
        }


        public static double math(double a, double b, double c)
        {
            return Math.pow(b,2)-4*a*c;
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            double a = Double.parseDouble(num_a.getText());
            double b = Double.parseDouble(num_b.getText());
            double c = Double.parseDouble(num_c.getText());
            result.setText(Double.toString(math(a,b,c)));
        }

        public static void main(String[] args)
        {
            new Main();
        }
    }
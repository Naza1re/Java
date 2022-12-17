import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab extends JFrame implements ActionListener {
        private final JFrame frame = new JFrame("lab 6.1");
        private final JButton button = new JButton("Расчет");

        private final JLabel A = new JLabel("А");
        private final JLabel B = new JLabel("B");
        private final JLabel C = new JLabel("С");
        private final JLabel RESULT = new JLabel("Результат");
        private final JTextField num_a = new JTextField();
        private final JTextField num_b = new JTextField();
        private final JTextField num_c = new JTextField();
        private final JTextField res = new JTextField();

        lab() {
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setBounds(100, 100, 300, 300);


            A.setBounds(40, 15, 100, 10);
            B.setBounds(40, 45, 100, 10);
            C.setBounds(40, 75, 100, 10);
            frame.add(A);
            frame.add(B);
            frame.add(C);


            num_a.setBounds(100, 10, 100, 25);
            num_b.setBounds(100, 40, 100, 25);
            num_c.setBounds(100, 70, 100, 25);
            frame.add(num_a);
            frame.add(num_b);
            frame.add(num_c);

            res.setBounds(100, 100, 100, 25);
            RESULT.setBounds(40, 100, 100, 25);
            frame.add(RESULT);
            frame.add(res);

            button.setBounds(100, 140, 100, 50);
            button.addActionListener(this);
            frame.add(button);
        }


        public static double math(double a1,double b1,double c1)
        {
            return Math.pow(b1, 2) - 4 * a1 * c1;
        }

            @Override
            public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(num_a.getText());
            double b = Double.parseDouble(num_b.getText());
            double c = Double.parseDouble(num_c.getText());
            res.setText(Double.toString(math(a,b,c)));

        }
                        public static void main(String[] args)
                        {
                            new lab();
                        }


    }







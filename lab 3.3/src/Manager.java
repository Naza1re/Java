import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager extends JFrame implements Job, ActionListener
{
    private final JTextField enter = new JTextField();
    private final JTextField result = new JTextField();
    private final JLabel enterL = new JLabel("Исходная строка");
    private final JLabel resultL = new JLabel("Преобразованная строка");
    private final JButton process = new JButton("Обработать");

    @Override
    public StringBuilder perform(StringBuilder str)
    {
        int start = 0;
        boolean flag = true;
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = 0; j < str.length() - 1; j++)
            {
                if (str.charAt(j) == '/' && str.charAt(j + 1) == '*' && flag)
                {
                    start = j;
                    flag = false;
                }
                if (str.charAt(j) == '*' && str.charAt(j + 1) == '/' && !flag)
                {
                    flag = true;
                    str.replace(start, j + 2, "");
                }
            }
        }
        return str;
    }

    public void createWindow()
    {
        setVisible(true);
        setLayout(null);
        setTitle("Лаба 3(3)");
        setBounds(100, 100, 400,400);
        setSize(400,400);

        enter.setBounds(200,100,150,20);
        result.setBounds(200,150,150,20);
        add(enter);
        add(result);

        enterL.setBounds(50,100,100,20);
        resultL.setBounds(50,150, 250,20);
        add(enterL);
        add(resultL);

        process.setBounds(200,200,150,50);
        process.addActionListener(this);
        add(process);
    }

    public static void main(String[] args)
    {
        new Manager().createWindow();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        result.setText(String.valueOf(perform(new StringBuilder(enter.getText()))));
    }
}

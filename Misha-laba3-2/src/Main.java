import java.util.Scanner;

public class Main
{
    public static StringBuilder del(StringBuilder s1) {
        int start = 0;
        boolean flag = true;



        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s1.length() - 1; j++)
            {
                int a = s1.indexOf("!");
                String aString = Integer.toString(a);

                if (s1.charAt(j) == '!'  && flag) {
                    start = j;

                    s1.replace(start, j+1 , aString);
                }

            }
        }
        return s1;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        StringBuilder s1 = new StringBuilder(in.nextLine());
        System.out.print("Преобразованная строка: " + del(s1));
    }
}

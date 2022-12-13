import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Введите массив ");
        ArrayList<String> tmp_arr = new ArrayList<>();
        String tmp;
        int size = 0;
        do
        {
            tmp=scan.nextLine();
            tmp_arr.add(tmp);
            System.out.println(tmp);
            size++;

        }while (!tmp.equals(""));

        tmp_arr.remove(tmp_arr.size() - 1);

        String[] arr = tmp_arr.toArray(new String[size - 1]);

        System.out.println("Исходный массив " + Arrays.toString(arr));
        System.out.print("Введите подстроку : ");

        String abc = scan.nextLine();
        Firstind c1 = new Firstind(abc);
        Arrays.sort(arr,c1);

        System.out.println("Первая сортировка : " + Arrays.toString(arr));
        System.out.println("Количество проходов 1: " + c1.kol);
        System.out.print("Введите вторую подстроку : ");
        abc = scan.nextLine();

        Count c2 = new Count(abc);

        System.out.println("Исходный массив  " + Arrays.toString(arr));
        Arrays.sort(arr, c2);
        System.out.println("Вторая соритровка :" + Arrays.toString(arr));
        System.out.println("Количество проходов : " + c2.kol);
    }
}

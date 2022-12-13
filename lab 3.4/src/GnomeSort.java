import java.util.Comparator;

public class GnomeSort<T> implements Sort<T>
{

    public void sort(T[] arr, Comparator<T> comp)
    {
        int i = 0;
        while (i < arr.length)
        {
            if (i == 0 || comp.compare(arr[i-1], arr[i]) < 0)
            {
                ++i;
            }
            else
            {
                T tmp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = tmp;
                i--;
            }
        }
    }
}

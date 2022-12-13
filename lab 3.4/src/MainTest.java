import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest
{
    @Test
    public void test1()
    {
        String[] arr = {"dfghtewret","sdfgthf","fghj"};
        String[] test = {"fghj","dfghtewret","sdfgthf"};
        Firstind firstind = new Firstind("f");
        SelectSort<String> sort = new SelectSort<>();
        sort.sort(arr,firstind);
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(arr));
    }

    @Test
    public void test2()
    {
        String[] arr = {"dfghtefwret","sfdfgthf","fghj"};
        String[] test = {"fghj","dfghtefwret","sfdfgthf"};
        Count firstind = new Count("f");
        GnomeSort<String> sort = new GnomeSort<String>();
        sort.sort(arr,firstind);
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(arr));
    }

}

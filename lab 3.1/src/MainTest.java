
import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;
        import org.junit.Assert;

        import java.util.Arrays;

public class MainTest
{
    @Test
    public void test1()
    {
        String[] args = {"dom","corova","ogorod"};
        String abc = "o";
        Firstind c1 = new Firstind(abc);
        Arrays.sort(args,c1);
        String[] test = {"ogorod", "dom","corova"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test2()
    {
        String[] args = {"corova","ogorod", "dom"};
        String abc = "o";
        Count c1 = new Count(abc);
        Arrays.sort(args,c1);
        String[] test = {"dom","corova","ogorod"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test3()
    {
        String[] args = {"garrod","ozon","rgon"};
        String abc = "o";
        Firstind c1 = new Firstind(abc);
        Arrays.sort(args,c1);
        String[] test = {"ozon","rgon","garrod"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }

    @Test
    public void test4()
    {
        String[] args = {"garorodo","ozon","rgon"};
        String abc = "o";
        Count c1 = new Count(abc);
        Arrays.sort(args,c1);
        String[] test = {"rgon","ozon","garorodo"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }
}
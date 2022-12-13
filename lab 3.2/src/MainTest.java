import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{
    @Test
    public void test1()
    {
        String s = "durov/*verni*/steny";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals( "durovsteny",Main.del(s1).toString());
    }

    @Test
    public void test2()
    {
        String s = "n/ew/*ear*/happy";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals("n/ewhappy",Main.del(s1).toString());
    }

    @Test
    public void test3()
    {
        String s = "easy//*hard*/lemon/";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals( "easy/lemon/",Main.del(s1).toString());

    }
    @Test
    public void test4()
    {
        String s = "hello/*helloy*/world";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals("helloworld",Main.del(s1).toString());
    }


}

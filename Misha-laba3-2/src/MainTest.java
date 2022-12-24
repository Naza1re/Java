import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest
{
    @Test
    public void test1()
    {
        String s = "fafasfa!fadfas!fadfas!";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals( "fafasfa7fadfas14fadfas22",Main.del(s1).toString());
    }

    @Test
    public void test2()
    {
        String s = "!!!!!!";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals("012345",Main.del(s1).toString());
    }

    @Test
    public void test3()
    {
        String s = "good!soft!";
        StringBuilder s1 = new StringBuilder(s);
        Assertions.assertEquals( "good4soft9",Main.del(s1).toString());

    }

}

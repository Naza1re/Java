import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MainTest {
    @Test
    public void test1() {
        String[] args = {"dom", "mcorova", "ogmorod"};
        String abc = "m";
        Lastind c1 = new Lastind(abc);
        Arrays.sort(args, c1);
        String[] test = {"dom","ogmorod" , "mcorova"};
        Assertions.assertEquals(Arrays.toString(test), Arrays.toString(args));
    }



}
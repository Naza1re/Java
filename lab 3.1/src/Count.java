import java.util.Comparator;

public class Count implements Comparator<String>
{
    private String abc;
    public int kol = 0;

    Count(String abc)
    {
        this.abc=abc;
    }

    int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    public int compare(String o1, String o2) {
        kol++;
        return count(o1,abc)-count(o2,abc);
    }
}
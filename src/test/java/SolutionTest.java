import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int n = 5;
        int k = 2;
        int expected = 3;
        int actual = new Solution().findTheWinner(n, k);

        Assert.assertEquals(expected, actual);
    }
}

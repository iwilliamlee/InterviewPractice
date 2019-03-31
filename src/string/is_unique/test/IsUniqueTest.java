import org.junit.Assert;
import org.junit.Test;
import string.is_unique.IsUnique;

public class IsUniqueTest {

    @Test
    public void test1() {

        String firstString = "hello";
        boolean firstRes = IsUnique.isUnique(firstString);
        Assert.assertFalse(firstRes);

    }

    @Test
    public void test2() {

        String secondString = "ancdlwfb";
        boolean secondRes = IsUnique.isUnique(secondString);
        Assert.assertTrue(secondRes);

    }

    @Test
    public void test3() {

        String secondString = "ThisisanincredibleString";
        boolean secondRes = IsUnique.isUnique(secondString);
        Assert.assertFalse(secondRes);

    }

}
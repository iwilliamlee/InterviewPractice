import org.junit.Assert;
import org.junit.Test;
import string.is_unique.IsUnique;
import string.is_unique.IsUniqueSol;


public class IsUniqueTestSol {

    @Test
    public void test1() {

        String firstString = "hello";
        boolean firstRes = IsUniqueSol.isUnique(firstString);
        Assert.assertFalse(firstRes);

    }

    @Test
    public void test2() {

        String secondString = "ancdlwfb";
        boolean secondRes = IsUniqueSol.isUnique(secondString);
        Assert.assertTrue(secondRes);

    }

    @Test
    public void test3() {

        String secondString = "ThisisanincredibleString";
        boolean secondRes = IsUniqueSol.isUnique(secondString);
        Assert.assertFalse(secondRes);

    }

}
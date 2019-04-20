import dynamic.coins.Coins;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinsTest {

    @Test
    public void Test1() {
        Coins coins = new Coins();
        System.out.println(coins.findCountRecurse(25));
    }
}
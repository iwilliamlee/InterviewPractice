import array.move_zeros_to_back.MoveZeros;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveZerosTest {

    @Test
    public void Test1() {
        int[] input = {1, 0, 1, 12, 0, 5};
        MoveZeros.moveZeros(input);
        for(int i : input) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    @Test
    public void Test2() {
        int[] input = {0, 0, 1, 12, 0, 5};
        MoveZeros.moveZeros(input);
        for(int i : input) {
            System.out.print(i + ", ");
        }
    }
}
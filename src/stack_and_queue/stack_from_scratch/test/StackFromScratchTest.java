import org.junit.Test;
import stack_and_queue.stack_from_scratch.StackFromScratch;

import java.util.Stack;

import static org.junit.Assert.*;

public class StackFromScratchTest {

    @Test
    public void Test1() {
        StackFromScratch<Integer> stack = new StackFromScratch();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
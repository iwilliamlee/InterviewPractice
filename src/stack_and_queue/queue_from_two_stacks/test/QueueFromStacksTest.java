import org.junit.Test;
import stack_and_queue.queue_from_two_stacks.QueueFromStacks;

import static org.junit.Assert.*;

public class QueueFromStacksTest {

    @Test
    public void deQueue() {

        QueueFromStacks<Integer> q = new QueueFromStacks<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

    }
}
import org.junit.Test;
import stack_and_queue.queue_from_scratch.QueueFromScratch;

import static org.junit.Assert.*;

public class QueueFromScratchTest {

    @Test
    public void test1() {
        QueueFromScratch<Integer> q = new QueueFromScratch<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()) {
            System.out.println(q.poll());
        }


    }


}
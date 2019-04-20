import common.LinkedList.Node;
import linked_list.LinkedListReversal.LinkedListReversal;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class LinkedListReversalTest {

    @Test
    public void Test1() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node newNode1 = LinkedListReversal.ReverseLinkedList(node1);
        Node curr = newNode1;
        while(curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }

    }
}
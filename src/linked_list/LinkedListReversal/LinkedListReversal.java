package linked_list.LinkedListReversal;

import common.LinkedList.Node;

import java.util.LinkedList;

public class LinkedListReversal {


    public static Node  ReverseLinkedList(Node node) {

        Node prev = null;
        Node curr = node;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;

    }

}


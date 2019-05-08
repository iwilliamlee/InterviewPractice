package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for(int i = 0; i < lists.length; i++) {
            ListNode curr = lists[i];
            while(curr != null) {
                integers.add(curr.val);
                curr = curr.next;
            }
        }
        if(integers == null || integers.size() == 0) return null;
        Collections.sort(integers);
        ListNode head = new ListNode(integers.get(0));
        ListNode curr = head;
        for(int i = 1; i < integers.size(); i++) {
            curr.next = new ListNode(integers.get(i));
            curr = curr.next;
        }

        return head;

//         PriorityQueue<ListNode> minHeap =
//             new PriorityQueue<ListNode>((a, b) -> a.val - b.val);

//         for(int i = 0; i < lists.length; i++) {
//             minHeap.add(lists[i]);
//         }

//         ListNode head = null;

//         ListNode curr = head;
//         while(!minHeap.isEmpty) {
//             ListNode next = minHeap.poll();
//         }
//         return null;
    }
}

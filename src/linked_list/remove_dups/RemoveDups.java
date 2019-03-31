package linked_list.remove_dups;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDups {

    public static void removeDups(LinkedList<Integer> list) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()) {
            Integer currentInt = iterator.next();
            if(hashMap.containsKey(currentInt)) {
                iterator.remove();
            }
            else {
                hashMap.put(currentInt, 1);
            }
        }
    }

}

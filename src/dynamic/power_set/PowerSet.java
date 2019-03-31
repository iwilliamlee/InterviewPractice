package dynamic.power_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PowerSet {

    public static HashSet<HashSet<Integer>> getAllSubSets(HashSet<HashSet<Integer>> subSets,
                                                          HashSet<Integer> superSet) {
        ArrayList<Integer> integers = new ArrayList<Integer>(superSet);
        for(Integer integer : integers) {
            superSet.remove(integer);
            if(!superSet.isEmpty() && !subSets.contains(superSet)) {
                subSets.add(new HashSet<Integer>(superSet));
                getAllSubSets(subSets, superSet);
            }
            superSet.add(integer);
        }

        return subSets;
    }


    public static HashSet<HashSet<Integer>> getAllSubSets(HashSet<Integer> superSet) {
        HashSet<HashSet<Integer>> subSets = new HashSet();
        return getAllSubSets(subSets, superSet);
    }

    public static void getAllHashSets() {
        HashSet<Integer> first = new HashSet<Integer>();
        first.add(1);
        first.add(2);
        first.add(3);

//        HashSet<Integer> second = first;

        HashSet<Integer> second = new HashSet<Integer>();
        second.add(2);
        second.add(3);
        second.add(1);

        Set<Set<Integer>> hashs = new HashSet();
        hashs.add(first);
        if(hashs.contains(second)) {
            System.out.println("It contains the second");
        }
        else {
            System.out.println("It doesn't contain the second");
        }


//        if(first.equals(second)) {
//            System.out.print("These are the same");
//        }
//        else {
//            System.out.print("These are not the same");
//        }

    }

}

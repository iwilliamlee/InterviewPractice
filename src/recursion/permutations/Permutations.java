package recursion.permutations;

import java.util.ArrayList;
import java.util.List;

public class Permutations {


    public static void recurse(List<List<Integer>> list, List<Integer> curr, int[] nums) {
        if(curr.size() == nums.length) {
            list.add(curr);
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                if(curr.contains(nums[i])) continue;
                curr.add(nums[i]);
                recurse(list, curr, nums);
                curr.remove(curr.size() - 1);
            }
        }
    }

}

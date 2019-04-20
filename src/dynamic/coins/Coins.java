package dynamic.coins;

import java.util.HashMap;

public class Coins {

    int[] coins = new int[] {5, 10, 25};

    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();



    private int findNumRecurse(int target, int current) {
        if(current > target) {
            return 0; //No path exists
        }
        else if(current == target) {
            return 1;
        }

        if(map.containsKey(current)) {
            return map.get(current);
        }
        else {
            map.put(current, 0);
        }
        int sum = 0;
        for(int currCoin : coins) {
            sum += findNumRecurse(target, current + currCoin);
        }
        map.replace(current, sum);
        return sum;
    }



    public int findCountRecurse(int total) {
        return findNumRecurse(total, 0);
    }
}

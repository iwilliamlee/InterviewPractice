package real_interview.google.LegoBlocks;

import java.util.HashMap;

/**
 * Google interview on 4-08-2019 Lego blocks
 * Given an 2 X N Matrix, how many ways can it be made up of smaller
 * 2 x 1 and 1 x 2 blocks.
 */
public class LegoBlocks {

    HashMap<Integer, Integer> visited;

    public LegoBlocks() {
        visited = new HashMap<>();
    }

    private int findRecurse(int n, int N) {

        if(n > N) {
            return 0;
        }
        if(n == N) {
            return 1;
        }

        if(visited.containsKey(n)) {
            return visited.get(n);
        }

        int oneBlock = findRecurse(n + 1, N);
        int twoBlock = findRecurse(n + 2, N);

        visited.put(n, oneBlock + twoBlock);

        return oneBlock + twoBlock;
    }


    public int findRecurse(int N) {
        return findRecurse(0, N);
    }

    public static int findLinear(int N) {
        int sum = 0;
        int previous1 = 1;
        int previous2 = 1;

        if(N == 0) {return 0;}
        if(N == 1) {return 1;}
        if(N == 2) {return 2;}

        for(int i = N - 2; i >= 0; i--) {

            sum = previous1 + previous2;
            previous2 = previous1;
            previous1 = sum;
        }
        return sum;
    }


}

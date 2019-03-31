package dynamic.triple_step;

import java.util.Arrays;

public class TripleStep {


    private static int findTripleStepRecurse(int stairs, int current, int step) {
        int nextStep = current + step;
        if(nextStep == stairs) return 1;
        if(current + step > stairs) return 0;
        int paths = 0;
        paths += findTripleStepRecurse(stairs, nextStep, 1);
        paths += findTripleStepRecurse(stairs, nextStep, 2);
        paths += findTripleStepRecurse(stairs, nextStep, 3);
        return paths;
    }

    public static int findTripleStepRecurse(int stairs) {
        int paths = 0;
        paths += findTripleStepRecurse(stairs, 0, 1);
        paths += findTripleStepRecurse(stairs, 0, 2);
        paths += findTripleStepRecurse(stairs, 0, 3);
        return paths;
    }


    public static int countWays(int n , int[] memo) {
        if(n < 0) return 0;
        if(n == 0) return 1;
        else if(memo[n] > -1) return memo[n];
        memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo)
                + countWays(n -3, memo);
        return memo[n];
    }

    public static int countWays(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return countWays(n, memo);
    }

}

package real_interview.amazon.michelle_substring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Michelle has created a word game for her students. The word game begins with Michelle writing a string and a number, K, on the board.
 * The students must find a substring of size K such that there is exactly one character that is repeated one;
 * in other words, there should be k - 1 distinct characters in the substring.
 */
public class SubstringRepeat {

    /**
     *
     * @param original
     * @param k
     * @return
     */
    public static List<String> findSingleRepeat(String original, int k) {
        int i = 0;

        List<String> solutions = new ArrayList<>();
        while(k + i <= original.length()) {
            Map<Character, Integer> map = new HashMap<>();
            boolean hasOneDuplicate = false;
            StringBuilder solutionBuilder = new StringBuilder();
            for(int j = i; j < i + k; j++) {
                solutionBuilder.append(original.charAt(j));
                if(!map.containsKey(original.charAt(j))) {
                    map.put(original.charAt(j), 1);
                }
                else {
                    int count = map.get(original.charAt(j));
                    if(count == 1 && !hasOneDuplicate) {
                        map.put(original.charAt(j), count + 1);
                        hasOneDuplicate = true;
                    }
                    else {
                        hasOneDuplicate = false;
                        break;
                    }

                }
            }
            if(hasOneDuplicate) {
                solutions.add(solutionBuilder.toString());
            }
            i++;
        }

        return solutions;
    }

}

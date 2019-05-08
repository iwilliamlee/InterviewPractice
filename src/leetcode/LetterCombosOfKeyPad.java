package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombosOfKeyPad {

    Map<Integer, String> keyPad;

    public List<String> letterCombinations(String digits) {
        keyPad = new HashMap<>();
        keyPad.put(2, "abc");
        keyPad.put(3, "def");
        keyPad.put(4, "ghi");
        keyPad.put(5, "jkl");
        keyPad.put(6, "mno");
        keyPad.put(7, "pqrs");
        keyPad.put(8, "tuv");
        keyPad.put(9, "wxyz");

        if(digits.length() == 0) {
            return new ArrayList<>();
        }
        return letterRecurse(digits);
    }

    private List<String> letterRecurse(String digits) {
        int digit = Character.getNumericValue(digits.charAt(0));
        List<String> possible = new ArrayList<>();
        if(digits.length() == 1) {
            for(int i = 0; i < keyPad.get(digit).length(); i++) {
                String str = keyPad.get(digit).substring(i, i+1);
                possible.add(str);
            }
            return possible;
        }

        List<String> allChildren = new ArrayList<>();
        allChildren = letterRecurse(digits.substring(1));

        for(int i = 0; i < keyPad.get(digit).length(); i++) {
            String str = keyPad.get(digit).substring(i, i+1);
            for(String child : allChildren) {
                possible.add(str + child);
            }
        }
        return possible;

    }
}

package string.is_unique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IsUnique {


    public static boolean isUnique(String a) {
        if(a.length() < 2) {
            return true;
        }
        ArrayList<Character> chars = new ArrayList<Character>();
        for(char c : a.toCharArray()) {
            chars.add(c);
        }
        Collections.sort(chars);
        char prevChar = chars.get(0);
        for(int i = 1; i < chars.size(); i++) {
            char currentChar = chars.get(i);
            if(currentChar == prevChar) {
                return false;
            }
            else {
                prevChar = currentChar;
            }
        }
        return true;
    }

}

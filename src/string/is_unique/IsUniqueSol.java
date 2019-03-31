package string.is_unique;

public class IsUniqueSol {

    public static boolean isUnique(String a) {

        if(a.length() > 128) {
            return false;
        }

        boolean charSet[] = new boolean[128];
        for(char currChar : a.toCharArray()) {
            if(charSet[currChar]) {
                return false;
            }
            else {
                charSet[currChar] = true;
            }
        }
        return true;
    }

}

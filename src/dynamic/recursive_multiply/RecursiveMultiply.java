package dynamic.recursive_multiply;

public class RecursiveMultiply {

    public static int recursiveMultipy2(int a, int b) {
        if(b == 0) {
            return 0;
        }
        return a + recursiveMultipy2(a, b - 1);
    }

    public static int recursiveMultiply(int a, int b) {
        int larger;
        int smaller;
        if(a > b) {
            larger = a;
        }
        else {
            smaller = b;
        }

        return 0;
    }
}

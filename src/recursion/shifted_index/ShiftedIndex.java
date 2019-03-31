package recursion.shifted_index;

/**
 * given a sorted random array. It is shifted to the right 0 to n-1 times.
 * Find the pivot
 * HINT: It is not linear search
 * example : {1, 4, 7, 8, 10} -> {10, 8, 1, 4, 7}
 */
public class ShiftedIndex {


    public static int findPivot(int[] a, int i) {
        if(i == 0) return i;
        if(a[i - 1] > a[i] && a[i + 1] > a[i]) return i;



        if(a[0] > a[i]) {
            return findPivot(a, i/2);
        }

        else if (a[i] > a[a.length - 1]) {
            return findPivot(a, (a.length - 1 - i) / 2 +  i);
        }
        else {
            return 0;
        }
    }

    public static int findPivot(int[] a){
        return findPivot(a, (a.length - 1)/2);
    }

}

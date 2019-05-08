package dynamic.magic_index;

/**
 * 8.3, Magic Index
 */
public class MagicIndex {


    private static int recurseFind(int[] arr, int i, int j) {
        if(i == j) { //They are now the same.
            return -1;
        }

        int midpoint = (j - i) / 2 + i;
        if(arr[midpoint] == midpoint) {
            return midpoint;
        }
        else if(arr[midpoint] > midpoint) {
            return recurseFind(arr, i, midpoint);
        }
        else {
            return recurseFind(arr, midpoint, j);
        }
    }


    public static int findMagicIndex(int[] arr) {
        return recurseFind(arr, 0, arr.length - 1);
    }

}

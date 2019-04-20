package common;

public class PrintUtil {
    public static void print2Darray(int[][] array) {
        System.out.println("[ ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            if(i == array.length - 1) {
                System.out.println("]");
            }
            else {
                System.out.println();
            }
        }
    }

}

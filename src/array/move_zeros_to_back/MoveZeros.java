package array.move_zeros_to_back;

public class MoveZeros {

    public static int[] moveZeros(int[] input) {

        int zeroCounter = 0;

        for(int i = 0; i < input.length; i++) {
            if(input[i] == 0) {
                zeroCounter++;
            }
        }


        int current = 0;
        for(int i = 0; i < input.length; i++) {
            if(input[i] == 0) continue;
            input[current] = input[i];
            current++;
        }

        for(int i = current; i  < input.length;  i++) {
            input[i] = 0;
        }

        return input;
    }

}

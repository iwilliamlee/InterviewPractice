package stack_and_queue.three_in_one;

import java.util.ArrayList;

public class ThreeStackArray<E> {

    int[] sizeArray = new int[3];
    ArrayList<E> stackArray = new ArrayList<E>(100);

    public ThreeStackArray(E nullItem) {
        for(int i = 0; i < 100; i++) {
            stackArray.add(nullItem);
        }
    }

    public void push(int stack, E item) {
        int index = (sizeArray[stack])*3 + stack;
        sizeArray[stack] += 1;
        stackArray.add(index, item);
    }

    public E pop(int stack) {
        sizeArray[stack] -= 1;
        int index = (sizeArray[stack]) * 3 + stack;
        return stackArray.get(index);
    }
}


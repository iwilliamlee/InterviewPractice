package dynamic.StackOfBoxes;

import java.util.Stack;

public class BoxStack extends Stack<Box> {

    int height;

    @Override
    public Box push(Box item) {
        height += item.height;
        return super.push(item);
    }

    @Override
    public synchronized Box pop() {
        Box popped = super.pop();
        height -= popped.height;
        return popped;
    }


}

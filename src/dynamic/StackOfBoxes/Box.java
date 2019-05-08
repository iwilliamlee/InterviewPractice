package dynamic.StackOfBoxes;

public class Box implements Comparable<Box>{

    public int width;
    public int height;
    public int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public int compareTo(Box o) {

        if(width > o.width && height > o.height && depth > o.depth) {
            return 1;
        }
        else if(width == o.width && height == o.height && depth == o.depth) {
            return 0;
        }
        else {
            return -1;
        }
    }
}

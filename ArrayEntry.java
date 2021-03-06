public class ArrayEntry extends Position {

    // This entry's index in the array.
    private int index;

    public ArrayEntry(int value, int index) {
        super(value);

        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

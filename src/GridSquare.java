public class GridSquare {
    public int state;
    public int pos;

    //Constructor
    GridSquare(int x) {
        pos = x;
        state = -1;
    }

    //method
    public char drawSpace() {
        if (state == 0) {
            return 'O';
        }
        if (state == 1) {
            return 'X';
        }
        return Integer.toString(pos).charAt(0);
    }
}
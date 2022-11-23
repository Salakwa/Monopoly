public class Square {
    protected String squareName;
    protected int squareLocationInt;

    public Square(String squareName, int squareLocationInt) {
        this.squareName = squareName;
        this.squareLocationInt = squareLocationInt;
    }

    public String getSquareName() {
        return squareName;
    }

    public int getSquareLocationInt() {
        return squareLocationInt;
    }

}

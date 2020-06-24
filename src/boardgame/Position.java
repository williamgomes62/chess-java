package boardgame;

public class Position {

    private int row;
    private int colum;


    public Position() {
    }

    public Position(int row, int colum) {
        this.row = row;
        this.colum = colum;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColunm() {
        return this.colum;
    }

    public void setColunm(int colum) {
        this.colum = colum;
    }

    @Override
    public String toString() {
        return row + ", " + colum;
    }
}
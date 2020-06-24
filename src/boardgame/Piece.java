package boardgame;

public class Piece {
    
    protected Position position;
    private Board board;

    public Piece() {
    }

    public Piece(Board board) {
        this.position = null;
        this.board = board;
    }

    protected Board getBoard() {
        return this.board;
    }


}
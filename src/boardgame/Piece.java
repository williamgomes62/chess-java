package boardgame;

public abstract class Piece {
    
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

    public abstract boolean[][] possibleMoves();

    public boolean possibleMoves(Position position) {
        return possibleMoves()[position.getRow()][position.getColunm()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }



}
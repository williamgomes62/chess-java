package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{
    

    public Bishop(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "B";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //nw
        p.setValues(position.getRow() - 1, position.getColunm() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setValues(p.getRow() - 1, p.getColunm() - 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }

        //ne
        p.setValues(position.getRow() - 1, position.getColunm() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setValues(p.getRow() - 1, p.getColunm() + 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }

        //se
        p.setValues(position.getRow() + 1, position.getColunm() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setValues(p.getRow() + 1, p.getColunm() + 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }

        //sw
        p.setValues(position.getRow() + 1, position.getColunm() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setValues(p.getRow() + 1, p.getColunm() - 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        return mat;
    }
    

}
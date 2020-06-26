package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE) {
            p.setValues(position.getRow() - 1, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            p.setValues(position.getRow() - 2, position.getColunm());
            Position p2 = new Position(position.getRow() - 2, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            p.setValues(position.getRow() - 1, position.getColunm() - 1);
            if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            p.setValues(position.getRow() - 1, position.getColunm() + 1);
            if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
        }
        else {
            p.setValues(position.getRow() + 1, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            p.setValues(position.getRow() + 2, position.getColunm());
            Position p2 = new Position(position.getRow() + 2, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            p.setValues(position.getRow() + 1, position.getColunm() - 1);
            if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            p.setValues(position.getRow() + 1, position.getColunm() + 1);
            if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
        }
        return mat;
    }

    @Override
    public String toString() {
        return "P";
    }
    
}
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;
/***
 * Torre
 */
public class Rook extends ChessPiece{
    

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        //above
        p.setValues(position.getRow() - 1, position.getColunm());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setRow(p.getRow() - 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }

        //left
        p.setValues(position.getRow(), position.getColunm() - 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setColunm(p.getColunm() - 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }

        //right
        p.setValues(position.getRow(), position.getColunm() + 1);
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setColunm(p.getColunm() + 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }

        //below
        p.setValues(position.getRow() + 1, position.getColunm());
        while (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
            p.setRow(p.getRow() + 1);
        }
        if (getBoard().positionExists(p) && isThereOppenentPiece(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        return mat;
    }
    

}
package entities.chess.pieces;

import entities.boardgame.Board;
import entities.chess.ChessPiece;
import entities.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}

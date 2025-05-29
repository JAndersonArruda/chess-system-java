package entities.chess.pieces;

import entities.boardgame.Board;
import entities.chess.ChessPiece;
import entities.chess.Color;

public class Queen extends ChessPiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "Q";
    }
}

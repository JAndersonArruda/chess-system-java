package entities.chess.pieces;

import entities.boardgame.Board;
import entities.chess.ChessPiece;
import entities.chess.Color;

public class Knigth extends ChessPiece {
    public Knigth(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "H";
    }
}

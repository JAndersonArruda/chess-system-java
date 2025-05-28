package application;

import entities.boardgame.Board;
import entities.chess.ChessMatch;
import entities.chess.ChessPiece;
import entities.chess.ChessPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(scan);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(scan);

            ChessPiece capturePiece =  chessMatch.performeChessMove(source, target);
        }
    }
}
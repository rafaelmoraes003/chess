package chess;

import boardgame.Board;

public class ChessMatch {
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] chessPieces = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i += 1) {
            for (int j = 0; j < board.getColumns(); j += 1) {
                chessPieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return chessPieces;
    }
}

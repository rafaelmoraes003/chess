package boardgame;

public abstract class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] possibleMoves = possibleMoves();
        for (int i = 0; i < possibleMoves.length; i += 1) {
            for (int j = 0; j < possibleMoves.length; j += 1) {
                if (possibleMoves[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }
}

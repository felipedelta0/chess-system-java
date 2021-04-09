package boardgame;

/**
 * @author luisf on 06/04/2021
 */
public abstract class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
//        boolean[][] matriz = possibleMoves();
//        for (int i = 0; i < matriz.length; i++) {
//            for (int j = 0; j < matriz.length; j++) {
//                if (matriz[i][j]) {
//                    return true;
//                }
//            }
//        }
//        return false;
        for (boolean[] booleans : possibleMoves()) {
            for (boolean boo : booleans) {
                if (boo) {
                    return true;
                }
            }
        }
        return false;
    }
}

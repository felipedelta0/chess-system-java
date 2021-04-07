package boardgame;

/**
 * @author luisf on 06/04/2021
 */
public class Piece {

    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }
}

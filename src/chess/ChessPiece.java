package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 * @author luisf on 07/04/2021
 */
public abstract class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

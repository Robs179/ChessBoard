package Game;

import Pieces.*;

public class Move {
    Player player;
    Spot start;
    Spot end;
    Piece pieceMoved;
    Piece pieceKilled;
    public Move(Player player, Spot start, Spot end) {
        this.player = player;
        this.start = start;
        this.end = end;
        pieceMoved = start.getPiece();
    }

}

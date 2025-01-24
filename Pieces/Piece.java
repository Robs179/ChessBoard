package Pieces;

import Game.*;

public abstract class Piece {
    
    public boolean white, killed;

    public Piece(boolean white) {
        this.white = white;
        this.killed = false;
    }

    public abstract boolean canMove(Board b, Spot start, Spot end);

    

}

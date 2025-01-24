package Pieces;

import Game.Board;
import Game.Spot;

public class King extends Piece{

    public King(boolean white) {
        super(white);
    }

    public boolean canMove(Board b, Spot start, Spot end) {
        
        if(start.equals(end)){
            return false;
        }
        if(end.getPiece() != null){
            if(end.getPiece().white == this.white){
                return false;
            }
        }

        int x = Math.abs(end.getX()-start.getX());
        int y = Math.abs(end.getY()-start.getY());

        return x<2 && y<2;
    }

    @Override
    public String toString() {
        if(white){
            return "K";
        }
        return "k";
    }
    
}

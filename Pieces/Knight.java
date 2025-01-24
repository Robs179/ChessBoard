package Pieces;
import Game.Board;
import Game.Spot;

public class Knight extends Piece{

    public Knight(boolean white) {
        super(white);
    }

    public boolean canMove(Board b, Spot start, Spot end) {
        
        //checks if endpoint is piece of same colour or the same spot
        if(start.equals(end)){
            return false;
        }
        if(end.getPiece() != null){
            if(end.getPiece().white == this.white){
                return false;
            }
        }
        
        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        return x * y == 2;
    }

    @Override
    public String toString() {
        if(white){
            return "N";
        }
        return "n";
    }
    
}

package Pieces;

import Game.Board;
import Game.Spot;

public class Pawn extends Piece{

    boolean hasMoved;

    public Pawn(boolean white) {
        super(white);
        hasMoved = false;
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

        int x = end.getX()-start.getX();
        int y = end.getY()-start.getY();

        //check if pawn can capture
        if(Math.abs(x)==1 && y==1){
            if (end.getPiece()!=null) {
                return true;
            }else{
                return false;
            }
        }

        if(x == 0){
            switch (y) {
                case 1:
                    return true;
                case 2:
                    if(!hasMoved){
                        return true;
                    } else{
                        return false;
                    }
                default:
                    return false;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        if(white){
            return "P";
        }
        return "p";
    }
    

    public void setMoved(boolean hasMoved){
        this.hasMoved = hasMoved;
    }
    public boolean getMoved(){
        return this.hasMoved;
    }
}

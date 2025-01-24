package Pieces;
import Game.Board;
import Game.Spot;

public class Rook extends Piece{

    public Rook(boolean white) {
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

        //get x direction (positive or negative)
        int dir = 0;
        if(start.getX() < end.getX()){
            dir = 1;
        } else{
            dir = -1;
        }

        //check along x-axis for available spots
        int i = start.getX() + dir;
        while (i < 8 && i > -1) {
            if(b.boxes[i][start.getY()].equals(end)){
                return true;
            }
            if(b.boxes[i][start.getY()].getPiece() != null){
                break;
            }
            i += dir;
        }

        //get y direction (positive or negative)
        if(start.getY() < end.getY()){
            dir = 1;
        } else{
            dir = -1;
        }

        //check along y-axis for available spots
        i = start.getY() + dir;
        while (i < 8 && i > -1) {
            if(b.boxes[start.getX()][i].equals(end)){
                return true;
            }
            if(b.boxes[start.getX()][i].getPiece() != null){
                break;
            }
            i += dir;
        }

        return false;
    }

    @Override
    public String toString() {
        if(white){
            return "R";
        }
        return "r";
    }
    
}

package Pieces;

import Game.Board;
import Game.Spot;

public class Queen extends Piece{

    public Queen(boolean white) {
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

        //Rook type moves:

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


        //Bishop type moves:

        // set directions
        int xdir = 0;
        int ydir = 0;
        if(start.getX() < end.getX()){
            xdir = 1;
        } else{
            xdir = -1;
        }
        if(start.getY() < end.getY()){
            ydir = 1;
        } else{
            ydir = -1;
        }

        // check the according diagonal
        i = start.getX() + xdir;
        int j = start.getY() + ydir;
        while (i < 8 && i > -1 && j < 8 && j > -1) {
            if(b.boxes[i][j].equals(end)){
                return true;
            }
            if(b.boxes[i][j].getPiece() != null){
               break;
            }
            i += xdir;
            j += ydir;
        }

        return false;
    }

    @Override
    public String toString() {
        if(white){
            return "Q";
        }
        return "q";
    }
    
}

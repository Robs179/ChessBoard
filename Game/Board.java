package Game;

import Pieces.*;

public class Board {
    
    public Spot[][] boxes;

    public Board(){
        boxes = new Spot[8][8];
        this.resetBoard();
    }

    public void resetBoard() {
        //create white pieces
        boxes[0][0] = new Spot(new Rook(true), 0, 0);
        boxes[1][0] = new Spot(new Knight(true), 1, 0);
        boxes[2][0] = new Spot(new Bishop(true), 2, 0);
        boxes[3][0] = new Spot(new Queen(true), 3, 0);
        boxes[4][0] = new Spot(new King(true), 4, 0);
        boxes[5][0] = new Spot(new Bishop(true), 5, 0);
        boxes[6][0] = new Spot(new Knight(true), 6, 0);
        boxes[7][0] = new Spot(new Rook(true), 7, 0);
        for (int i = 0; i < 8; i++) {
            boxes[i][1] = new Spot(new Pawn(true), i, 1); // white pawns
        }
        //create black pieces
        boxes[0][7] = new Spot(new Rook(false), 0, 7);
        boxes[1][7] = new Spot(new Knight(false), 1, 7);
        boxes[2][7] = new Spot(new Bishop(false), 2, 7);
        boxes[3][7] = new Spot(new Queen(false), 3, 7);
        boxes[4][7] = new Spot(new King(false), 4, 7);
        boxes[5][7] = new Spot(new Bishop(false), 5, 7);
        boxes[6][7] = new Spot(new Knight(false), 6, 7);
        boxes[7][7] = new Spot(new Rook(false), 7, 7);
        for (int i = 0; i < 8; i++) {
            boxes[i][6] = new Spot(new Pawn(false), i, 6); // black pawns
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 2; j < 6 ; j++) {
                boxes[i][j] = new Spot(null, i, j);
            }
        }
    }

    public void emptyBoard(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 ; j++) {
                boxes[i][j] = new Spot(null, i, j);
            }
        }
    }

    public void setPiece(Piece p, int x, int y){
        if(x<8 && x>-1 && y<8 && y>-1){
            boxes[x][y] = new Spot(p, x, y);
        }
    }

    public String showMoves(int x, int y){
        String string = "";
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 8; j++) {
                if(boxes[x][y].getPiece().canMove(this, boxes[x][y], boxes[j][i])){
                    string += "X";
                } else{
                    string += "_";
                }
            }
            string += "\n";
        }
        return string;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 7; i > -1; i--) {
            for (int j = 0; j < 8; j++) {
                string += boxes[j][i].toString();
            }
            string += "\n";
        }
        return string;
    }
}

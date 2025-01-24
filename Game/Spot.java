package Game;
import Pieces.Piece;

public class Spot {
    
    public Piece piece;
    int x, y;

    public Spot(Piece piece, int x, int y) {
        this.piece = piece;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        if(piece==null){
            return "_";
        }
        return piece.toString();
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

   
}

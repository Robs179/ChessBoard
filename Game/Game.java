package Game;

import java.util.List;


// import Pieces.*;

public class Game {
    
    Player[] players;
    Board board;
    Player currentTurn;
    Status status;
    List<Move> moves;

    
    public static void main(String[] args) {
        Board board = new Board();
        
        //board.emptyBoard();
        
        //board.setPiece(new Rook(true), 4, 4);
        //board.setPiece(new Rook(false), 2, 4);

        System.out.println(board.toString());

        // System.out.println("Here are all possible moves:");
        // System.out.println(board.showMoves(1, 0));
    }
} 

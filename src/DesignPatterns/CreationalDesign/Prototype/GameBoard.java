package DesignPatterns.CreationalDesign.Prototype;

import java.util.ArrayList;
import java.util.List;

public class GameBoard implements Prototype<GameBoard> {
    private List<GamePiece> pieces = new ArrayList<>();

    public void addPiece(GamePiece piece) {
        pieces.add(piece);
    }

    public void showBoardState() {
        for (GamePiece piece : pieces) {
            System.out.println(piece);
        }
    }

    //Making deep copy of each piece object
    @Override
    public GameBoard clone() {
        GameBoard newGameBoard = new GameBoard();
        for (GamePiece piece : pieces) {
            newGameBoard.addPiece(piece.clone());
        }
        return newGameBoard;
    }
}

package DesignPatterns.CreationalDesign.Prototype;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.addPiece(new GamePiece("Red", 1));
        gameBoard.addPiece(new GamePiece("Black", 20));
        gameBoard.addPiece(new GamePiece("White", 5));
        gameBoard.showBoardState();

        //Cloning the board
        GameBoard clonedGameBoard = gameBoard.clone();
        clonedGameBoard.showBoardState();
    }
}

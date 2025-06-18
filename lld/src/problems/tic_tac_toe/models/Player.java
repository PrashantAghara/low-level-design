package problems.tic_tac_toe.models;

public class Player {
    public PlayingPiece piece;
    public String name;

    public Player(String name, PlayingPiece piece) {
        this.name = name;
        this.piece = piece;
    }
}

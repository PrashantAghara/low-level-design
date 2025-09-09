package problems.snakenladder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> players = new LinkedList<>();
    Player winner;

    public Game() {
        initialiseGame();
    }

    private void initialiseGame() {
        this.board = new Board(10, 5, 5);
        this.dice = new Dice(1);
        Player p1 = new Player(1, 0);
        Player p2 = new Player(2, 0);
        this.players.add(p1);
        this.players.add(p2);
    }

    public void startGame() {
        while (winner == null) {
            Player player = nextPlayerTurn();
            System.out.println("Player " + player.id + "'s turn" + " current position is : " + player.position);
            int diceRoll = dice.rollDice();
            int playerPosition = player.position + diceRoll;
            playerPosition = jumpCheck(playerPosition);
            player.position = playerPosition;
            System.out.println("Player " + player.id + "'s new position is : " + playerPosition);
            if (playerPosition >= board.cells.length * board.cells.length - 1) {
                this.winner = player;
            }
        }

        System.out.println("Winner is : " + winner.id);
    }

    private Player nextPlayerTurn() {
        Player player = this.players.removeFirst();
        this.players.addLast(player);
        return player;
    }

    private int jumpCheck(int position) {
        if (position > board.cells.length * board.cells.length - 1) {
            return position;
        }
        Cell cell = board.getCell(position);
        if (cell.jump != null && cell.jump.start == position) {
            String jump = (cell.jump.start < cell.jump.end) ? "Ladder" : "Snake";
            System.out.println("Jump done by : " + jump);
            return cell.jump.end;
        }
        return position;
    }
}

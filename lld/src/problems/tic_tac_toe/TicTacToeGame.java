package problems.tic_tac_toe;

import problems.tic_tac_toe.models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board board;

    public TicTacToeGame() {
        players = new LinkedList<>();
        PlayingPieceX cross = new PlayingPieceX();
        PlayingPieceO round = new PlayingPieceO();
        Player player1 = new Player("Player1", cross);
        Player player2 = new Player("Player2", round);
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public String startGame() {
        Scanner scanner = new Scanner(System.in);
        boolean noWinner = true;

        while (noWinner) {
            Player playerTurn = players.removeFirst();
            board.printBoard();
            List<Pair> freeSpaces = board.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                break;
            }

            System.out.println("Player : " + playerTurn.name);
            System.out.print("Enter Row,column : ");
            String s = scanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0]);
            int inputCol = Integer.parseInt(values[1]);
            boolean pieceAdded = board.addPiece(inputRow, inputCol, playerTurn.piece);
            if (!pieceAdded) {
                System.out.println("Incorrect Position, Try Again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isThereWinner(inputRow, inputCol, playerTurn.piece.pieceType);
            if (winner) {
                return playerTurn.name;
            }
        }
        return "Tie";
    }

    private boolean isThereWinner(int row, int col, PieceType type) {
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        for (int i = 0;i < board.size; i++) {
            if (board.board[row][i] == null || board.board[row][i].pieceType != type) {
                rowMatch = false;
                break;
            }
        }

        for (int i = 0;i < board.size; i++) {
            if (board.board[i][col] == null || board.board[i][col].pieceType != type) {
                colMatch = false;
                break;
            }
        }

        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != type) {
                diagonalMatch = false;
                break;
            }
        }

        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j].pieceType != type) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || colMatch || diagonalMatch || antiDiagonalMatch;
    }
}

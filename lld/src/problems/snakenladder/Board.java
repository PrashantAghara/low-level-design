package problems.snakenladder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;
    int snake;
    int ladder;

    public Board (int size, int snake, int ladder) {
        initializeCells(size);
        addSnakesLadders(snake, ladder);
    }

    private void initializeCells(int size) {
        this.cells = new Cell[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }
    }

    private void addSnakesLadders(int snakes, int ladders) {
        while (snakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1, this.cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, this.cells.length * cells.length - 1);

            if (snakeHead <= snakeTail) continue;

            Jump snake = new Jump();
            snake.start = snakeHead;
            snake.end = snakeTail;
            Cell cell = getCell(snakeHead);
            cell.jump = snake;
            snakes--;
        }

        while (ladders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1, this.cells.length * cells.length - 1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1, this.cells.length * cells.length - 1);

            if (ladderStart >= ladderEnd) continue;

            Jump snake = new Jump();
            snake.start = ladderStart;
            snake.end = ladderEnd;
            Cell cell = getCell(ladderStart);
            cell.jump = snake;
            ladders--;
        }
    }

    public Cell getCell(int position) {
        int row = position / cells.length;
        int col = position % cells.length;
        return this.cells[row][col];
    }
}

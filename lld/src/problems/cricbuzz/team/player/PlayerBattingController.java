package problems.cricbuzz.team.player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
    Queue<Player> yetToPlay;
    Player striker;
    Player nonStriker;

    public PlayerBattingController(Queue<Player> playing11) {
        this.yetToPlay = new LinkedList<>();
        this.yetToPlay.addAll(playing11);
    }

    public void getNextPlayer() throws Exception {
        if (yetToPlay.isEmpty()) {
            throw new Exception();
        }

        if (striker == null) {
            this.striker = yetToPlay.poll();
        }

        if (nonStriker == null) {
            this.nonStriker = yetToPlay.poll();
        }
    }

    public Player getStriker() {
        return this.striker;
    }

    public Player getNonStriker() {
        return this.nonStriker;
    }

    public void setStriker(Player player) {
        this.striker = player;
    }

    public void setNonStriker(Player player) {
        this.nonStriker = player;
    }

}

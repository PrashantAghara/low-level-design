package problems.cricbuzz.innings;

import problems.cricbuzz.team.Team;
import problems.cricbuzz.team.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Over {
    int overNumber;
    List<Ball> balls;
    int extraBallsCount;
    Player bowledBy;

    Over(int overNumber, Player bowledBy) {
        this.overNumber = overNumber;
        balls = new ArrayList<>();
        this.bowledBy = bowledBy;
    }

    public boolean startOver(Team battingTeam, Team bowlingTeam, int runsToWin) throws Exception {
        int ballCount = 1;
        while (ballCount <= 6) {
            Ball ball = new Ball(ballCount);
            ball.startBallDelivery(battingTeam, bowlingTeam, this);
            if (ball.ballType == BallType.NORMAL) {
                balls.add(ball);
                ballCount++;
                if (ball.wicket != null) {
                    battingTeam.chooseNextBatsMan();
                }

                if (runsToWin != -1 && battingTeam.getTotalRuns() >= runsToWin) {
                    battingTeam.isWinner = true;
                    return true;
                }
            } else {
                extraBallsCount++;
            }
        }
        return false;
    }

}

package problems.cricbuzz.team;

import problems.cricbuzz.innings.Ball;
import problems.cricbuzz.innings.Over;
import problems.cricbuzz.team.player.Player;

public class Wicket {
    public WicketType wicketType;
    public Player takenBy;
    public Over overDetail;
    public Ball ballDetail;

    public Wicket(WicketType wicketType, Player takenBy, Over overDetail, Ball ballDetail) {
        this.wicketType = wicketType;
        this.takenBy = takenBy;
        this.overDetail = overDetail;
        this.ballDetail = ballDetail;
    }
}

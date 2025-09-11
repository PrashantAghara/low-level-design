package problems.cricbuzz.innings;

import problems.cricbuzz.team.Team;
import problems.cricbuzz.team.player.Player;
import problems.cricbuzz.type.MatchType;

import java.util.ArrayList;
import java.util.List;

public class Inning {
    Team battingTeam;
    Team bowlingTeam;
    MatchType matchType;
    List<Over> overs;

    public Inning(Team battingTeam, Team bowlingTeam, MatchType matchType) {
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.matchType = matchType;
        overs = new ArrayList<>();
    }

    public void start(int runsToWin) {
        //set batting players
        try {
            battingTeam.chooseNextBatsMan();
        } catch (Exception e) {

        }

        int noOfOvers = matchType.noOfOvers();
        for (int overNumber = 1; overNumber <= noOfOvers; overNumber++) {

            //chooseBowler
            bowlingTeam.chooseNextBowler(matchType.maxOverCountBowlers());

            Over over = new Over(overNumber, bowlingTeam.getCurrentBowler());
            overs.add(over);
            try {
                boolean won = over.startOver(battingTeam, bowlingTeam, runsToWin);
                if (won) {
                    break;
                }
            } catch (Exception e) {
                break;
            }

            //swap striket and non striker
            Player temp = battingTeam.getStriker();
            battingTeam.setStriker(battingTeam.getNonStriker());
            battingTeam.setNonStriker(temp);
        }
    }

    public int getTotalRuns() {
        return battingTeam.getTotalRuns();
    }

}

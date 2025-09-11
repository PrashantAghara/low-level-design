package problems.cricbuzz.type;

public class FiftyOverMatch implements MatchType {
    @Override
    public int noOfOvers() {
        return 50;
    }

    @Override
    public int maxOverCountBowlers() {
        return 10;
    }
}

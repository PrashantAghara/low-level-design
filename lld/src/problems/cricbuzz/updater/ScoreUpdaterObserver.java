package problems.cricbuzz.updater;

import problems.cricbuzz.innings.Ball;

public interface ScoreUpdaterObserver {
    void update(Ball ball);
}

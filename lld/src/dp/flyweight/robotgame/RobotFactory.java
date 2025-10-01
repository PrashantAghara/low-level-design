package dp.flyweight.robotgame;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static final Map<String, Robot> roboticObjectCache = new HashMap<>();

    public static Robot createRobot(String robotType) {
        if (roboticObjectCache.containsKey(robotType)) {
            // if exists, return the cached object.
            return roboticObjectCache.get(robotType);
        } else {
            // if not exists, create the object and cache it.
            if (robotType.equals("HUMANOID")) {
                Sprites humanoidSprite = new Sprites();
                Robot humanoidObject = new Humanoid(robotType, humanoidSprite);
                // add to cache
                roboticObjectCache.put(robotType, humanoidObject);
                return humanoidObject;
            } else if (robotType.equals("ROBOTIC_DOG")) {
                Sprites roboticDogSprite = new Sprites();
                Robot roboticDogObject = new Dog(robotType, roboticDogSprite);
                // add to cache
                roboticObjectCache.put(robotType, roboticDogObject);
                return roboticDogObject;
            }
        }
        throw new IllegalArgumentException("Invalid robot type: " + robotType);
    }

    public static int getTotalRobots() {
        return roboticObjectCache.size();
    }

}

package problems.elevator.elevatorcar;

import problems.elevator.enums.Direction;

public class Display {
    int floor;
    Direction direction;

    public void setDisplay(int floor, Direction direction) {
        this.direction = direction;
        this.floor = floor;
    }

    public void showDisplay() {
        System.out.println(floor);
        System.out.println(direction);
    }
}

package problems.elevator.dispatchers;

import problems.elevator.ElevatorCar;
import problems.elevator.ElevatorController;
import problems.elevator.ElevatorCreator;

import java.util.List;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitInternalRequest(int floor, ElevatorCar elevatorCar){

    }
}

package problems.elevator.dispatchers;

import problems.elevator.ElevatorController;
import problems.elevator.ElevatorCreator;
import problems.elevator.enums.Direction;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList = ElevatorCreator.elevatorControllerList;

    public void submitExternalRequest(int floor, Direction direction){


        //for simplicity, i am following even odd,
        for(ElevatorController elevatorController : elevatorControllerList) {

            int elevatorID = elevatorController.elevatorCar.id;
            if (elevatorID%2==1 && floor%2==1){
                elevatorController.submitExternalRequest(floor,direction);
            } else if(elevatorID%2==0 && floor%2==0){
                elevatorController.submitExternalRequest(floor,direction);

            }
        }
    }

}

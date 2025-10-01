package dp.command;

public class TurnACOffCommand implements Command {
    AirConditioner airConditioner;

    public TurnACOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.turnOff();
    }
}

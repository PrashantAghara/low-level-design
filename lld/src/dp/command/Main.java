package dp.command;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        Remote remote = new Remote();
        remote.setCommand(new TurnAcOnCommand(ac));
        remote.pressButton();
        remote.setCommand(new TurnACOffCommand(ac));
        remote.pressButton();
    }
}

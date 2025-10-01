package dp.command;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOff() {
        isOn = false;
        System.out.println("AC is Off");
    }

    public void turnOn() {
        isOn = true;
        System.out.println("AC is On");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature is : " + this.temperature);
    }
}

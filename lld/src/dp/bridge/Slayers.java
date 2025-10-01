package dp.bridge;

public abstract class Slayers {
    Breathing breathing;

    public Slayers(Breathing breathing) {
        this.breathing = breathing;
    }

    abstract void breathing();
}

package dp.bridge;

public class Giyu extends Slayers {

    public Giyu(Breathing breathing) {
        super(breathing);
    }

    @Override
    void breathing() {
        breathing.breathe();
    }
}

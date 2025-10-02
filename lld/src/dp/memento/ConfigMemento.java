package dp.memento;

public class ConfigMemento {
    int height;
    int weight;

    public ConfigMemento(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}

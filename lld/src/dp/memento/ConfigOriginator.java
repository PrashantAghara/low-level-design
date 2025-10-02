package dp.memento;

public class ConfigOriginator {
    int height;
    int weight;

    public ConfigOriginator(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ConfigMemento createMemento() {
        return new ConfigMemento(this.height, this.weight);
    }

    public void restoreMemento(ConfigMemento memento) {
        this.height = memento.height;
        this.weight = memento.weight;
    }
}

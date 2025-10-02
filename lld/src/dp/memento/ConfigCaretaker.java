package dp.memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigCaretaker {
    List<ConfigMemento> history = new ArrayList<>();

    public void addMemento(ConfigMemento configMemento) {
        history.add(configMemento);
    }

    public ConfigMemento undo() {
        if (!history.isEmpty()) {
            int lastIdx = history.size() - 1;
            ConfigMemento memento = history.get(lastIdx);
            history.remove(lastIdx);
            return memento;
        }
        return null;
    }
}

package dp.command;

import java.util.Stack;

public class Remote {
    Stack<Command> commandHistory = new Stack<>();
    Command command;

    Remote() {
    }

    public void setCommand(Command command) {
        this.command = command;
        commandHistory.push(command);
    }

    public void pressButton() {
        command.execute();
    }

    public void undo() {
        if (!commandHistory.isEmpty()) {
            commandHistory.pop().undo();
        }
    }
}

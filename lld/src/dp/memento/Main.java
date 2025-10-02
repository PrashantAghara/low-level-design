package dp.memento;

public class Main {
    public static void main(String[] args) {
        ConfigCaretaker caretaker = new ConfigCaretaker();
        ConfigOriginator originator = new ConfigOriginator(5, 10);
        ConfigMemento snapshot1 = originator.createMemento();
        caretaker.addMemento(snapshot1);
        originator.setHeight(10);
        originator.setWeight(100);
        System.out.println("Height : " + originator.height);
        System.out.println("Weight : " + originator.weight);
        ConfigMemento oldMemento = caretaker.undo();
        originator.restoreMemento(oldMemento);
        System.out.println("Height : " + originator.height);
        System.out.println("Weight : " + originator.weight);
    }
}

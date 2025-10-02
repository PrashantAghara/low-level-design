package dp.visitor;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}

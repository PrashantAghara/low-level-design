package dp.visitor;

public class RoomMaintenanceVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Performing maintenance for Single Room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Performing maintenance for Double Room");
    }
}

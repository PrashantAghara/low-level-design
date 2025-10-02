package dp.visitor;

public class RoomPricingVisitor implements RoomVisitor {
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Pricing computation logic for Single room");
        singleRoom.price = 1000;
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Pricing computation logic for Double room");
        doubleRoom.price = 2000;
    }
}

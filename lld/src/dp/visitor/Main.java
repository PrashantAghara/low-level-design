package dp.visitor;

public class Main {
    public static void main(String[] args) {
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();

        RoomVisitor pricingVisitor = new RoomPricingVisitor();
        RoomVisitor maintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(pricingVisitor);
        System.out.println("Single Room Price : " + ((SingleRoom) singleRoom).price);
        doubleRoom.accept(pricingVisitor);
        System.out.println("Double Room Price : " + ((DoubleRoom) doubleRoom).price);

        singleRoom.accept(maintenanceVisitor);
        doubleRoom.accept(maintenanceVisitor);
    }
}

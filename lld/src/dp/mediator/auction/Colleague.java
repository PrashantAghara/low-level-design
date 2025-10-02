package dp.mediator.auction;

public interface Colleague {
    void placeBid(int bid);

    void receiveNotification(int bid);

    String getName();
}

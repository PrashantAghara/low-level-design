package dp.mediator.auction;

public class Bidder implements Colleague {
    String name;
    Mediator auctionMediator;

    public Bidder(String name, Mediator mediator) {
        this.name = name;
        this.auctionMediator = mediator;
        auctionMediator.addBidder(this);
    }

    @Override
    public void placeBid(int bid) {
        auctionMediator.placeBid(this, bid);
    }

    @Override
    public void receiveNotification(int bid) {
        System.out.println("Bidder: " + name + " got the notification that someone has put the bid of : " + bid);
    }

    @Override
    public String getName() {
        return this.name;
    }
}

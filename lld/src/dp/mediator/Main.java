package dp.mediator;

import dp.mediator.auction.AuctionMediator;
import dp.mediator.auction.Bidder;
import dp.mediator.auction.Colleague;
import dp.mediator.auction.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();
        Colleague prashant = new Bidder("Prashant", mediator);
        Colleague abc = new Bidder("ABC", mediator);

        prashant.placeBid(1000);
        abc.placeBid(3000);
        prashant.placeBid(5000);
    }
}

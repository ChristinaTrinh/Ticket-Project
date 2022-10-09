//WalkUpTicket class represents a walk-up even ticket
//Walk-up tickets have the price of $50
public class WalkUpTicket extends Ticket {
    public WalkUpTicket(int number) {
        super(number);
    }

    public double getPrice() {
        return 50;
    }
}

// AdvanceTicket represents tickets purchased in advance
// Advance tickets purchased 10 or more days before the event cost $30
// and purchased fewer than 10 days before the event cost $40
public class AdvanceTicket extends Ticket {
    private int days;

    public AdvanceTicket(int number, int days) {
        super(number);
        this.days = days;
    }

    public double getPrice() {
        if (this.days >= 10)
            return 30;
        else
            return 40;
    }

    public int getDays() {
        return this.days;
    }
}

//StudentAdvanceTicket reprsents tickets purchased in advance by students
//Student advance tickets purchased >10 days before the event cost $15
//and <10 days before the event cost $40 (half of a normal advance ticket)
public class StudentAdvanceTicket extends AdvanceTicket {
    public StudentAdvanceTicket(int number, int days) {
        super(number, days);
    }

    public double getPrice() {
        return 0.5 * super.getPrice();
    }

    public String toString() {
        return "Number: " + this.getNumber() + ", Price: " + this.getPrice() + ".0 (ID required)";
    }
}

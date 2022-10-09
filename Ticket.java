//This represents a ticket
public abstract class Ticket {
    private int number;

    public Ticket(int number) {
        this.number = number;
    }

    public abstract double getPrice();

    public String toString() {
        return "Number: " + this.number + ", Price: " + this.getPrice() + ".0";
    }

    public int getNumber() {
        return this.number;
    }
}

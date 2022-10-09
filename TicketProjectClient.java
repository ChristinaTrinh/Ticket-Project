//This is the client of the ticket class
public class TicketProjectClient {
    public static void main(String[] args) {
        WalkUpTicket walkUpWillie = new WalkUpTicket(1001);
        AdvanceTicket advancedAdam = new AdvanceTicket(1002, 10);
        Ticket advancedAmy = new AdvanceTicket(1003, 9);
        StudentAdvanceTicket studentSally = new StudentAdvanceTicket(1004, 10);
        Ticket studentScott = new StudentAdvanceTicket(1005, 9);
        Ticket tickets[] = { walkUpWillie, advancedAdam, advancedAmy, studentSally, studentScott };

        System.out.println(" Array tickets: ");
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("\t" + tickets[i]);
        }
        System.out.println();

        System.out.println("Ticket costs:");
        System.out.println("\t walkUpWillie.getPrice() = " + walkUpWillie.getPrice());
        System.out.println("\t advancedAdam.getPrice() = " + advancedAdam.getPrice());
        System.out.println("\t advancedAmy.getPrice() = " + advancedAmy.getPrice());
        System.out.println("\t studentSally.getPrice() = " + studentSally.getPrice());
        System.out.println("\t studentScott.getPrice() = " + studentScott.getPrice());

    } // main

}

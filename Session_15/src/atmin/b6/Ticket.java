package atmin.b6;

public class Ticket {
    int ticketNumber;
    String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    @Override
    public String toString() {
        return "Ticket: " + ticketNumber + ", Issued Time: " + issuedTime;
    }
}

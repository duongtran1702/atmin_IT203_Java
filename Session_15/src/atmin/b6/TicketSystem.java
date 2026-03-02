package atmin.b6;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Queue;

public class TicketSystem {
    Queue<Ticket> ticketQueue = new ArrayDeque<>();
    static int currentNumber = 0;

    public void issueTicket() {
        currentNumber++;
        Ticket ticket = new Ticket(currentNumber, LocalTime.now().toString());
        ticketQueue.add(ticket);
    }

    public Ticket callNextTicket() {
        return ticketQueue.poll();
    }
}

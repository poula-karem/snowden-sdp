import java.util.*;

// Singleton Ticket Booking System
public class TicketBookingSystem {
    private static TicketBookingSystem instance;
    private Map<String, Ticket> bookings;
    private SessionManager sessionManager;

    private TicketBookingSystem() {
        bookings = new HashMap<>();
        sessionManager = SessionManager.getInstance();
    }

    public static synchronized TicketBookingSystem getInstance() {
        if (instance == null) {
            instance = new TicketBookingSystem();
        }
        return instance;
    }

    public Ticket bookTicket(User user, Movie movie, Theater theater, String showtime) {
        String bookingId = generateBookingId();
        Ticket ticket = new Ticket(bookingId, user, movie, theater, showtime);
        bookings.put(bookingId, ticket);
        sessionManager.trackBooking(ticket);
        return ticket;
    }

    private String generateBookingId() {
        return UUID.randomUUID().toString();
    }

    public void cancelTicket(String bookingId) {
        Ticket ticket = bookings.remove(bookingId);
        if (ticket != null) {
            sessionManager.removeBooking(ticket);
        }
    }
}

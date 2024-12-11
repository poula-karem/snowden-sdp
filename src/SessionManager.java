import java.util.*;

// Singleton Session Manager
public class SessionManager {
    private static SessionManager instance;
    private Set<Ticket> activeBookings;

    private SessionManager() {
        activeBookings = new HashSet<>();
    }

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void trackBooking(Ticket ticket) {
        activeBookings.add(ticket);
    }

    public void removeBooking(Ticket ticket) {
        activeBookings.remove(ticket);
    }

    public int getActiveBookingsCount() {
        return activeBookings.size();
    }
}

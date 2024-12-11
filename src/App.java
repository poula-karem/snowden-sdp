// Main Application
public class App {
    public static void main(String[] args) {
        // Create movie using MovieFactory
        Movie actionMovie = MovieFactory.createMovie("ACTION", "Avengers", 15.99);

        // Create theater using TheaterFactory
        Theater imax = TheaterFactory.createTheater("IMAX", "Downtown IMAX", 200);

        // Create user
        User user = new User("John Doe", "john@example.com");

        // Book ticket using Singleton Ticket Booking System
        TicketBookingSystem bookingSystem = TicketBookingSystem.getInstance();
        Ticket ticket = bookingSystem.bookTicket(user, actionMovie, imax, "8:00 PM");

        // Session tracking
        SessionManager sessionManager = SessionManager.getInstance();
        System.out.println("Active Bookings: " + sessionManager.getActiveBookingsCount());
    }
}

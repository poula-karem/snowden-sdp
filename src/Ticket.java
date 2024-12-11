public class Ticket {
    private String bookingId;
    private User user;
    private Movie movie;
    private Theater theater;
    private String showtime;

    public Ticket(String bookingId, User user, Movie movie, Theater theater, String showtime) {
        this.bookingId = bookingId;
        this.user = user;
        this.movie = movie;
        this.theater = theater;
        this.showtime = showtime;
    }

    public String getBookingId() {
        return bookingId;
    }
}
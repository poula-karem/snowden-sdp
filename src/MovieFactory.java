// Movie Factory
public class MovieFactory {
    public static Movie createMovie(String genre, String title, double price) {
        switch (genre.toUpperCase()) {
            case "ACTION":
                return new ActionMovie(title, price);
            case "COMEDY":
                return new ComedyMovie(title, price);
            case "DRAMA":
                return new DramaMovie(title, price);
            default:
                throw new IllegalArgumentException("Unsupported movie genre");
        }
    }
}
// Theater Factory
public class TheaterFactory {
    public static Theater createTheater(String type, String name, int capacity) {
        switch (type.toUpperCase()) {
            case "CINEMA_HALL":
                return new CinemaHall(name, capacity);
            case "IMAX":
                return new IMAXTheater(name, capacity);
            default:
                throw new IllegalArgumentException("Unsupported theater type");
        }
    }
}
# Documentation

### This project we made is a Movie Ticket Booking System designed with scalability, maintainability, and reusability in mind. It uses several design patterns and organizes functionality into separate classes to ensure modularity.

## Classes and Descriptions

1. SessionManager
    - Purpose: Tracks active bookings in the system.
    - Type: Singleton
    - Methods: 
        - getInstance(): Returns the single instance of SessionManager.
        - trackBooking(Ticket ticket): Adds a ticket to active bookings.
        - removeBooking(Ticket ticket): Removes a ticket from active bookings.
        - getActiveBookingsCount(): Returns the count of active bookings.
- Justification:
  - The SessionManager ensures a consistent global view of active bookings across the application using the Singleton pattern.

---

2. TicketBookingSystem
    - Purpose: Handles ticket booking and cancellation functionality.
    - Type: Singleton
    - Methods: 
        - getInstance(): Ensures only one instance exists globally.
        - bookTicket(User user, Movie movie, Theater theater, String showtime)- Books a ticket and tracks it via SessionManager.
        - cancelTicket(String bookingId): Cancels a ticket and updates SessionManager.
- Justification:
  - A Singleton pattern ensures centralized booking management. It prevents conflicts and duplication when interacting with bookings from multiple parts of the application.

---

  3. MovieFactory
    - Purpose: Creates Movie objects based on genre.
    - Type: Factory Method
    - Method: 
        - createMovie(String genre, String title, double price): Returns an appropriate subclass of Movie (e.g., ActionMovie, ComedyMovie).

- Justification:
  - The Factory Method pattern abstracts the creation of movies, allowing easy addition of new genres without modifying existing code.

---

4. TheaterFactory
    - Purpose: Creates Theater objects based on type.
    - Type: Factory Method
    - Method: 
        - createTheater(String type, String name, int capacity): Returns an appropriate subclass of Theater (e.g., IMAXTheater, CinemaHall).
 
- Justification:
    - Similar to MovieFactory, the Factory Method pattern simplifies the creation of theaters and supports extensibility.

---

5. Theater
    - Purpose: Abstract base class representing a theater.
    - Attributes: 
        - name: The name of the theater.
        - capacity: The seating capacity of the theater.

- Justification:
    - Polymorphism allows various theater types (e.g., IMAXTheater, CinemaHall) to share common behavior, with room for type-specific features.

---

6. Movie
    - Purpose: Abstract base class representing a movie.
    - Attributes: 
        - title: Title of the movie.
        - price: Ticket price for the movie.

- Justification:
  - Polymorphism supports various movie genres (ActionMovie, ComedyMovie, etc.) while maintaining a shared interface for interaction.

---

7. Ticket
    - Purpose: Represents a ticket booked by a user.
    - Attributes: 
        - bookingId: Unique identifier for the booking.
        - user: The user who booked the ticket.
        - movie: The movie being booked.
        - theater: The theater for the booking.
        - showtime: The time of the show.

- Justification:
  - The Ticket class centralizes booking information, making it easy to manage and retrieve details.

---

8. User
    - Purpose: Represents a user interacting with the system.
    - Attributes: 
        - name: The name of the user.
        - email: The email of the user.

- Justification:
  - Encapsulates user data, supporting potential user-specific extensions (e.g., loyalty points).

---

9. App
    - Purpose: The entry point of the system where different components are brought together.
    - Responsibilities: 
        - Demonstrates interaction between factories, Singleton systems, and classes.
        - Logs the count of active bookings using SessionManager.

 ## Design Patterns Used
1. Singleton Pattern
   - Used In: SessionManager, TicketBookingSystem
   - Purpose: Ensures a single instance for session management and ticket booking, avoiding inconsistencies in shared resources.
   - Why?: Provides global access points while maintaining centralized control.

2. Factory Method Pattern
   - Used In: MovieFactory, TheaterFactory
   - Purpose: Encapsulates object creation logic for movies and theaters, making the system easy to extend and manage.
   - Why?: Abstracts object creation, reducing coupling and adhering to the Open/Closed Principle.

3. Polymorphism
   - Used In: Theater, Movie
   - Purpose: Allows common behavior across subclasses while enabling specific behavior for each subclass.
   - Why?: Simplifies code, supports type-specific extensions, and enhances flexibility.

4. Encapsulation
    - Used In: Ticket, User
    - Purpose: Encapsulates data to ensure information hiding and controlled access.
    - Why?: Promotes data integrity and reduces external dependencies.

- Benefits of the Design
    1. Scalability: New movie genres or theater types can be added with minimal changes.
    2. Maintainability: Centralized logic and single responsibility classes simplify updates.
    3. Reusability: Modular components like MovieFactory and TheaterFactory can be reused in similar applications.
    4. Thread Safety: Singleton instances are synchronized, ensuring safe access in concurrent environments.

---

### Project members:
 |           Name           |  ID    |
 | -------------------------|--------|
 | Ahmed Mohamed Abdelmohsen| 2100409|
 | Poula Karem Farag        | 2101445|
 | Belal Saeid Ali          | 2100569|
 | Raghda El-Sayed          | 2101450|
 | Shams Ayman              | 2101624|
 | Mohamed Ashraf El-Sayed  | 2101169|

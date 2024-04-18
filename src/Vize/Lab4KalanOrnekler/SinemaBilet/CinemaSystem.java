package Vize.Lab4KalanOrnekler.SinemaBilet;

public class CinemaSystem {
    public Ticket createTicket(Movie movie, int hallNumber, String
            sessionTime) {
        Ticket ticket = new Ticket(movie, hallNumber, sessionTime);
        return ticket;
    }
}
// Ornek6 main class


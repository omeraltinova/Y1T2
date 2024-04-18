package Vize.Lab4KalanOrnekler.SinemaBilet;

// Ticket class
public class Ticket {
    private Movie movie;
    private int hallNumber;
    private String sessionTime;

    public Ticket(Movie movie, int hallNumber, String sessionTime) {
        this.movie = movie;
        this.hallNumber = hallNumber;
        this.sessionTime = sessionTime;
    }

    public void displayInfo() {
        System.out.println("Bilet Detayları:");
        System.out.println("Film Adı: " + movie.getTitle());

        System.out.println("Tür: " + movie.getGenre());
        System.out.println("Süre: " + movie.getDuration() + " dakika");
        System.out.println("Gösterim Salonu: " + hallNumber);
        System.out.println("Seans Saati: " + sessionTime);
    }
}

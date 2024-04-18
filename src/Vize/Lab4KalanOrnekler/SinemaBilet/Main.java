package Vize.Lab4KalanOrnekler.SinemaBilet;
//Sinema bilet sistemi : Bir sinema işletmesi, film gösterimlerini yönetmek için bir sistem
//kullanmaktadır. Her film, bir ad, bir tür (örneğin, aksiyon, komedi, dram), bir süre (dakika
//cinsinden) ve bir gösterim salonu numarası içermektedir. Sistem, seçilen filmi, gösterim
//salonu numarasını ve seans saatini alarak bir bilet oluşturur.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Test the system
        Movie movie = new Movie("Interstellar", "Bilim Kurgu",
                169, 3);
        CinemaSystem cinemaSystem = new CinemaSystem();
        Ticket ticket = cinemaSystem.createTicket(movie, 3,
                "18:30");
// bileti yazdir
        ticket.displayInfo();
    }
}

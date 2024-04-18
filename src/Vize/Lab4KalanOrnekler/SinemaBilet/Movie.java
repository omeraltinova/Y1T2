package Vize.Lab4KalanOrnekler.SinemaBilet;
public class Movie {
    // degiskenler
    private String title;
    private String genre;
    private int duration;
    private int hallNumber;
    // yapici
    public Movie(String title, String genre, int duration, int hallNumber)
    {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.hallNumber = hallNumber;
    }
    // metod
    public String getTitle() {
        return title;
    }
    // metod
    public String getGenre() {
        return genre;
    }
    // metod
    public int getDuration() {
        return duration;
    }
    // metod
    public int getHallNumber() {
        return hallNumber;
    }
}
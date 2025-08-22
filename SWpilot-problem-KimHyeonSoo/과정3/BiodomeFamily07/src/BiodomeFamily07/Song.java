package BiodomeFamily07;

public class Song {
    private String title;
    private int duration; // in minutes
    private String artist;

    public Song(String title, int duration, String artist) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
    public String getArtist() { return artist; }

    public String getInfo() {
        return title + ", " + duration + "분, " + artist;
    }
}
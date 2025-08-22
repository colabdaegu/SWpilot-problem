package BiodomeFamily07;

public class ManagerSong extends Song {
    private String genre; // 재즈, 팝, 클래식, 힙합

    public ManagerSong(String title, int duration, String artist, String genre) {
        super(title, duration, artist);
        this.genre = genre;
    }

    public String getGenre() { return genre; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + genre;
    }
}
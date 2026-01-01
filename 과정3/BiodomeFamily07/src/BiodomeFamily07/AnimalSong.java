package BiodomeFamily07;

public class AnimalSong extends Song {
    private String targetAnimal; // 사슴, 당나귀, 코끼리

    public AnimalSong(String title, int duration, String artist, String targetAnimal) {
        super(title, duration, artist);
        this.targetAnimal = targetAnimal;
    }

    public String getTargetAnimal() { return targetAnimal; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", " + targetAnimal;
    }
}
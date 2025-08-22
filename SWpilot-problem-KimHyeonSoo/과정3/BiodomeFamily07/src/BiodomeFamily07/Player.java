package BiodomeFamily07;

public class Player {
    private Song currentSong;
    private int volume = 1;

    public void play(Song song) {
        currentSong = song;
        System.out.println("\"" + song.getInfo() + "\" 재생합니다.");

        // 재생 이후에 볼륨 확인 및 자동 조절
        if (song instanceof AnimalSong && volume > 5) {
            volume = 5;
            System.out.println("볼륨을 5로 설정합니다.");
        }
    }

    public void pause() {
        if (currentSong != null) {
            System.out.println("음악을 일시정지합니다: " + currentSong.getTitle());
        }
    }

    public void setVolume(int volume) {
        if (currentSong instanceof AnimalSong) {
            if (volume < 0 || volume > 5) {
                System.out.println("경고: 동물용 음악 볼륨은 0~5 사이여야 합니다.");
                return;
            }
        } else {
            if (volume < 0 || volume > 50) {
                System.out.println("경고: 사람용 음악 볼륨은 0~50 사이여야 합니다.");
                return;
            }
        }
        this.volume = volume;
        System.out.println("볼륨을 " + volume + "으로 설정합니다.");
    }
}
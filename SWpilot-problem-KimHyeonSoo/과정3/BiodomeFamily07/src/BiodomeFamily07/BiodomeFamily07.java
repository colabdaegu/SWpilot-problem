package BiodomeFamily07;

import java.util.*;

public class BiodomeFamily07 {
	public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        Player player = new Player();

        // 음악 5곡 추가
        musicLibrary.addSong(new AnimalSong("초원을 그리며", 2, "레이나", "사슴"));
        musicLibrary.addSong(new AnimalSong("영웅 호테", 1, "돈키", "당나귀"));
        musicLibrary.addSong(new AnimalSong("과자를 줄게", 3, "제롬", "코끼리"));
        musicLibrary.addSong(new ManagerSong("화양연화", 2, "장양림", "재즈"));
        musicLibrary.addSong(new ManagerSong("시간의 수평선", 4, "하윤", "팝"));
        
        System.out.println();

        // 사람 음악 검색 및 재생
        List<ManagerSong> managerSongs = new ArrayList<>();
        for (Song s : musicLibrary.getSongs()) {
            if (s instanceof ManagerSong) {
                managerSongs.add((ManagerSong) s);
            }
        }
        if (!managerSongs.isEmpty()) {
            player.play(managerSongs.get(0));  // 사람 노래 중 첫 번째 곡 재생
            player.setVolume(30);
        }

        // 당나귀 음악 검색 및 재생
        List<Song> donkeySongs = musicLibrary.searchByAnimal("당나귀");
        if (!donkeySongs.isEmpty()) {
            player.play(donkeySongs.get(0));  // 당나귀 노래 중 첫 번째 곡 재생
        }
        
        System.out.println();

        // 노래 삭제
        musicLibrary.deleteSong("시간의 수평선");
    }
}

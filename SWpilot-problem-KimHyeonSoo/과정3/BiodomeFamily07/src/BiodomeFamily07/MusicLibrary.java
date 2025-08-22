package BiodomeFamily07;

import java.util.*;

public class MusicLibrary {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        for (Song s : songs) {
            if (s.getTitle().equals(song.getTitle())) {
                System.out.println("경고: 같은 제목의 노래가 이미 존재합니다.");
                return;
            }
        }
        songs.add(song);
        System.out.println("새로운 노래 \"" + song.getInfo() + "\" 추가되었습니다.");
    }

    public void deleteSong(String title) {
        for (Song s : songs) {
            if (s.getTitle().equals(title)) {
                songs.remove(s);
                System.out.println("노래 \"" + s.getInfo() + "\" 삭제되었습니다.");
                return;
            }
        }
        System.out.println("경고: 삭제할 노래를 찾을 수 없습니다.");
    }

    public List<Song> searchByAnimal(String animal) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s instanceof AnimalSong && ((AnimalSong) s).getTargetAnimal().equals(animal)) {
                result.add(s);
            }
        }
        if (result.isEmpty()) {
            System.out.println("검색 결과: 해당 동물을 위한 노래가 없습니다.");
        }
        return result;
    }

    public List<Song> searchByGenre(String genre) {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s instanceof ManagerSong && ((ManagerSong) s).getGenre().equals(genre)) {
                result.add(s);
            }
        }
        if (result.isEmpty()) {
            System.out.println("검색 결과: 해당 장르의 노래가 없습니다.");
        }
        return result;
    }

    public List<Song> getAllAnimalSongs() {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s instanceof AnimalSong) result.add(s);
        }
        return result;
    }

    public List<Song> getAllManagerSongs() {
        List<Song> result = new ArrayList<>();
        for (Song s : songs) {
            if (s instanceof ManagerSong) result.add(s);
        }
        return result;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
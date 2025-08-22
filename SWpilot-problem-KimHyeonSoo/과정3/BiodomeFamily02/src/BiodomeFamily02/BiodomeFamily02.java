package BiodomeFamily02;

public class BiodomeFamily02 {
    public static void main(String[] args) {
        LifeNest lifeNest = new LifeNest();

        // 객체 생성
        Organism penguin = new Organism("펭귄", "동물", "남극");
        Organism koala = new Organism("코알라", "동물", "호주");
        Organism cactus = new Organism("선인장", "식물", "사막");
        Organism peppermint = new Organism("페퍼민트", "식물", "정원");

        // 객체 추가
        lifeNest.addOrganism(penguin);
        lifeNest.addOrganism(koala);
        lifeNest.addOrganism(cactus);
        lifeNest.addOrganism(peppermint);

        // 전체 출력
        lifeNest.displayAll();

        // 삭제
        lifeNest.removeOrganism("코알라");
        lifeNest.removeOrganism("선인장");
        
        // getter 구현
        lifeNest.getter("페퍼민트");

        // setter 구현
        lifeNest.setter("펭귄", "해변");

        // 전체 출력
        lifeNest.displayAll();
    }
}
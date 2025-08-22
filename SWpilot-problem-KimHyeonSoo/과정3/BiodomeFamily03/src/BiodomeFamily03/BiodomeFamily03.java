package BiodomeFamily03;

public class BiodomeFamily03 {
    public static void main(String[] args) {
        LifeNest lifeNest = new LifeNest();

        // 객체 생성
        Animal penguin = new Animal("펭귄", "남극", "육식", "물고기");
        Animal koala = new Animal("코알라", "호주", "초식", "유칼립투스");
        Plant cactus = new Plant("선인장", "사막", "11월", "열매 있음");
        Plant peppermint = new Plant("페퍼민트", "정원", "7월", "열매 없음");

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

        // 전체 출력
        lifeNest.displayAll();
    }
}
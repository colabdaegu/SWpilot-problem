package RuleOfBiodome04;

public class RuleOfBiodome04 {
    public static void main(String[] args) {
        // 생물 개체 생성
        BiologicalEntity<Feature> cat = new BiologicalEntity<>("고양이", "동물",
                new AnimalFeature("귀여움", "포유류", "20년"));
        BiologicalEntity<Feature> zebra = new BiologicalEntity<>("얼룩말", "동물",
                new AnimalFeature("잘 달린다", "포유류", "10년"));
        BiologicalEntity<Feature> rosemary = new BiologicalEntity<>("로즈마리", "식물",
                new PlantFeature("보라색", "열매 없음", "7월"));
        BiologicalEntity<Feature> cherry = new BiologicalEntity<>("벚꽃", "식물",
                new PlantFeature("분홍색", "열매 있음", "3월"));
        BiologicalEntity<Feature> ecoli = new BiologicalEntity<>("이콜라이", "미생물",
                new MicrobeFeature("약 산성", "호흡 및 발효 대사"));
        BiologicalEntity<Feature> bacillus = new BiologicalEntity<>("바실러스", "미생물",
                new MicrobeFeature("약 산성", "호흡 대사"));

        // 초기 정보 출력
        System.out.println(cat);
        System.out.println(zebra);
        System.out.println(rosemary);
        System.out.println(cherry);
        System.out.println(ecoli);
        System.out.println(bacillus);
        System.out.println();

        // 시스템 생성
        BiologicalSystem<Feature> system = new BiologicalSystem<>();
        System.out.println("생물정보 시스템이 생성되었습니다.\n");

        // 생물 추가
        system.add(cat);
        system.add(zebra);
        system.add(rosemary);
        system.add(cherry);
        system.add(ecoli);
        system.add(bacillus);
        System.out.println();

        // 가장 최근 생물 삭제
        system.delete();
        System.out.println();

        // 가장 최근 생물 출력
        system.show();
        System.out.println();

        // 비었는지 확인
        if (system.isEmpty()) {
            System.out.println("생물 정보 리스트는 비어있습니다.");
        } else {
            System.out.println("생물 정보 리스트가 비어있지 않습니다.");
        }
        System.out.println();

        // 전체 삭제
        system.clear();
        System.out.println();

        // 다시 비었는지 확인
        if (system.isEmpty()) {
            System.out.println("생물 정보 리스트는 비어있습니다.");
        } else {
            System.out.println("생물 정보 리스트가 비어있지 않습니다.");
        }
    }
}

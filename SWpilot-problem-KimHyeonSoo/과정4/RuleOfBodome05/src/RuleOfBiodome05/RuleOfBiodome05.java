package RuleOfBiodome05;

public class RuleOfBiodome05 {
    public static void main(String[] args) {
        PlantHashMap<String, String> plantMap = new PlantHashMap<>();

        plantMap.put("장미", "장미는 관상용으로 많이 재배되는 화초 중 하나이다.");
        plantMap.put("해바라기", "해바라기는 태양을 따라 움직이는 것으로 알려져 있다.");
        plantMap.put("민들레", "민들레는 약용으로도 사용되는 풀이다.");
        plantMap.put("튤립", "튤립은 봄에 피는 화사한 꽃이다.");
        plantMap.put("백합", "백합은 향기가 좋은 꽃으로 알려져 있다.");
        plantMap.put("코스모스", "코스모스는 가을을 대표하는 꽃이다.");
        plantMap.put("국화", "국화는 전통적으로 제사에 사용된다.");
        plantMap.put("선인장", "선인장은 건조한 지역에서 잘 자란다.");
        plantMap.put("연꽃", "연꽃은 물에서 자라며 불교와 관련이 깊다.");
        plantMap.put("벚꽃", "벚꽃은 봄을 대표하는 꽃으로 일본에서 인기가 많다.");

        System.out.println("\n(식물 특징 검색)");
        plantMap.get("장미");
        plantMap.get("해바라기");


        System.out.println("\n(식물 삭제)");
        plantMap.remove("민들레");

        System.out.println("\n(식물 이름으로 인덱스 출력)");
        System.out.println("'장미' 인덱스: " + plantMap.getIndex("장미"));
        System.out.println("'해바라기' 인덱스: " + plantMap.getIndex("해바라기"));
    }
}
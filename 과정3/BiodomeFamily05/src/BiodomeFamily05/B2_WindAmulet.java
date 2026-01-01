package BiodomeFamily05;

public class B2_WindAmulet extends B0_AncientArtifact implements C2_WeatherController {
    B2_WindAmulet() {
        super("바람의 부적");
    }

    @Override
    public void describe() {
        System.out.println("\"바람의 부적으로 에너지 생성 중! 주변 공기의 흐름을 이용해 날씨를 조절합니다.\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"바람의 부적으로 바람을 일으켜 날씨를 변화시킵니다!\"");
    }
}
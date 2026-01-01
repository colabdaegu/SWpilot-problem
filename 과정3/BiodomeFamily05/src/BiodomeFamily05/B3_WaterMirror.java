package BiodomeFamily05;

public class B3_WaterMirror extends B0_AncientArtifact implements C1_EnergyGenerator, C2_WeatherController {
    B3_WaterMirror() {
        super("물의 거울");
    }

    @Override
    public void describe() {
        System.out.println("\"물의 거울로 에너지 생성 중! 수증기를 모아 에너지를 생성하고, 날씨를 조절합니다.\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("\"물의 거울을 이용해 수증기로 에너지를 생성했습니다!\"");
    }

    @Override
    public void controlWeather() {
        System.out.println("\"물의 거울이 습도를 조절하여 비와 눈을 내리게 합니다!\"");
    }
}
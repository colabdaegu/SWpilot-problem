package BiodomeFamily05;

public class B1_SolarStone extends B0_AncientArtifact implements C1_EnergyGenerator {
    B1_SolarStone() {
        super("태양의 돌");
    }

    @Override
    public void describe() {
        System.out.println("\"태양의 돌로 에너지 생성 중! 빛을 받은 시간에 따라 에너지의 양이 달라집니다.\"");
    }

    @Override
    public void generateEnergy() {
        System.out.println("\"태양의 돌이 태양 에너지를 받아 에너지를 생성합니다!\"");
    }
}
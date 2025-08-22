package BiodomeFamily04;

public class WindEnergy extends EnergySource {
    private int windSpeed;

    WindEnergy(int windSpeed) {
        super("풍력");
        this.windSpeed = windSpeed;
    }

    public void setWindSpeed(int speed) {
        this.windSpeed = speed;
    }

    @Override
    public void produceEnergy() {
        int produced = windSpeed * 5;
        addEnergy(produced);
        System.out.println(getSourceName() + " 에너지를 " + produced + " 생산했습니다.");
    }
}
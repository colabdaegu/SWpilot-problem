package BiodomeFamily04;

public class SolarEnergy extends EnergySource {
    private int sunshineHours;

    SolarEnergy(int sunshineHours) {
        super("태양광");
        this.sunshineHours = sunshineHours;
    }

    public void setSunshineHours(int hours) {
        this.sunshineHours = hours;
    }

    @Override
    public void produceEnergy() {
        int produced = sunshineHours * 10;
        addEnergy(produced);
        System.out.println(getSourceName() + " 에너지를 " + produced + " 생산했습니다.");
    }
}

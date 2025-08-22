package BiodomeFamily04;

public class GeoThermalEnergy extends EnergySource {
    private int geoTemperature;

    GeoThermalEnergy(int geoTemperature) {
        super("지열");
        this.geoTemperature = geoTemperature;
    }

    public void setTemperature(int temperature) {
        this.geoTemperature = temperature;
    }

    @Override
    public void produceEnergy() {
        int produced = geoTemperature * 5 + 20;
        addEnergy(produced);
        System.out.println(getSourceName() + " 에너지를 " + produced + " 생산했습니다.");
    }
}
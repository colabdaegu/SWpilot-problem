package BiodomeFamily04;

public class BiodomeFamily04 {
    public static void main(String[] args) {
    	// 에너지 원천 생성
        SolarEnergy solar = new SolarEnergy(5);  // 5시간 x 10 = 50
        WindEnergy wind = new WindEnergy(12);   // 속도12 x 5 = 60
        GeoThermalEnergy geo = new GeoThermalEnergy(4);   // 온도4 x 5 + 20 = 40

        // 각 에너지 원천으로 에너지 생산을 수행
        solar.produceEnergy();
        wind.produceEnergy();
        geo.produceEnergy();
        
        System.out.println();

        // 각 에너지 원천의 에너지를 30씩 사용
        solar.useEnergy(30);
        wind.useEnergy(30);
        geo.useEnergy(30);
        
        System.out.println();

        // 남아있는 에너지량을 출력
        EnergyManager manager = new EnergyManager();
        manager.addSource(solar);
        manager.addSource(wind);
        manager.addSource(geo);

        manager.getTotalEnergy();
    }
}

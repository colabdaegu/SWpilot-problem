package BiodomeFamily04;

import java.util.ArrayList;

public class EnergyManager {
    private ArrayList<EnergySource> sources = new ArrayList<>();

    public void addSource(EnergySource source) {
        sources.add(source);
    }

    public void getTotalEnergy() {
        int total = 0;
        for (EnergySource source : sources) {
            total += source.getEnergyAmount();
        }
        System.out.println("남은 에너지: " + total);
    }
}
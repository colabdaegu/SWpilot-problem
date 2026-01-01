package BiodomeFamily05;

import java.util.ArrayList;
import java.util.List;

public class D_Sorcerer {
    private String name;
    private List<B0_AncientArtifact> artifacts = new ArrayList<>();

    D_Sorcerer(String name) {
        this.name = name;
        System.out.println("마법사 '" + name + "'이 생성되었습니다.");
    }

    public void addArtifact(B0_AncientArtifact artifact) {
        artifacts.add(artifact);
        System.out.println("마법사 '" + name + "'이 " + artifact.getName() + "을 소유하게 되었습니다.");
    }

    
    public void checkDescription(B0_AncientArtifact artifact) {
    	System.out.println("\n마법사 '" + name + "'이 " + artifact.getName() + "의 능력을 확인합니다.\n");
        artifact.describe();
    }
    
    
    public void useSkill(B0_AncientArtifact artifact) {
    	if (artifact instanceof C1_EnergyGenerator) {
    		System.out.println("\n마법사 '" + name + "'이 " + artifact.getName() + "의 에너지 생성 능력을 사용합니다.");
    		
    		C1_EnergyGenerator energy = (C1_EnergyGenerator) artifact;
    		energy.generateEnergy();
        }

    	else if (artifact instanceof C2_WeatherController) {
        	System.out.println("\n마법사 '" + name + "'이 " + artifact.getName() + "의 날씨 능력을 사용합니다.");
        	
        	C2_WeatherController weather = (C2_WeatherController) artifact;
        	weather.controlWeather();
        }
    }
    public void useSkill(B0_AncientArtifact artifact, int num) {
    	try {
    		if(num == 1) {
    			System.out.println("\n마법사 '" + name + "'이 " + artifact.getName() + "의 에너지 생성 능력을 사용합니다.");
    			
    			C1_EnergyGenerator energy = (C1_EnergyGenerator) artifact;
        		energy.generateEnergy();
    		} else if(num == 2) {
    			System.out.println("\n마법사 '" + name + "'이 " + artifact.getName() + "의 날씨 능력을 사용합니다.");
    			
    			C2_WeatherController weather = (C2_WeatherController) artifact;
            	weather.controlWeather();
    		}
    	} catch(Exception e) {
    		System.out.print("경고: 존재하지 않는 능력입니다.");
    		System.exit(1);
    	}
    }
}
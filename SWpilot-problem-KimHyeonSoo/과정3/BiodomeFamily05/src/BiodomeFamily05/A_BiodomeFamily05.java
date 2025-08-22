package BiodomeFamily05;

public class A_BiodomeFamily05 {
    public static void main(String[] args) {
    	// 마법사 객체 생성
        D_Sorcerer ariel = new D_Sorcerer("아리엘");

        // 세 가지 유물 객체를 생성
        B1_SolarStone solarStone = new B1_SolarStone();
        B2_WindAmulet windAmulet = new B2_WindAmulet();
        B3_WaterMirror waterMirror = new B3_WaterMirror();
        
        System.out.println();
        // 마녀가 소유
        ariel.addArtifact(solarStone);
        ariel.addArtifact(windAmulet);
        ariel.addArtifact(waterMirror);

        
        // 마법사가 유물의 능력 확인
        ariel.checkDescription(solarStone);
        
        // 마법사가 유물의 능력 사용(오버로딩 사용, 능력이 2개 이상인 경우 능력 넘버링 입력)
        //ariel.useSkill(windAmulet);
        ariel.useSkill(waterMirror, 1);
    }
}
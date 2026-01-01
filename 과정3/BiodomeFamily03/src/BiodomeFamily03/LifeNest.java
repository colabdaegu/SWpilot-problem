package BiodomeFamily03;

import java.util.ArrayList;

public class LifeNest {
	private ArrayList<Organism> organismList = new ArrayList<>();

    public void addOrganism(Organism organism) {
        organismList.add(organism);
        System.out.println("[LifeNest] " + organism.getName() + "이 추가되었습니다.");
    }

    public void removeOrganism(String name) {
        for (int i = 0; i < organismList.size(); i++) {
            if (organismList.get(i).getName().equals(name)) {
                System.out.println("[LifeNest] " + name + "가 삭제되었습니다.");
                organismList.remove(i);
                return;
            }
        }
        System.out.println("[LifeNest] " + name + "을 찾을 수 없습니다.");
    }

    public void displayAll() {
        System.out.println("\n전체 동식물 목록 출력:");
        for (int i = 0; i < organismList.size(); i++) {
            System.out.print(" " + (i + 1) + ". ");
            organismList.get(i).displayInfo();
        }
        System.out.println();
    }
}

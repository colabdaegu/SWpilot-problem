package RuleOfBiodome04;
import java.util.*;

class BiologicalSystem<T extends Feature> {
    private List<BiologicalEntity<T>> entities = new ArrayList<>();

    public void add(BiologicalEntity<T> entity) {
        entities.add(entity);
        System.out.println("새로운 생물이 등록되었습니다 : " + entity.getName());
    }

    public void delete() {
        if (!entities.isEmpty()) {
            BiologicalEntity<T> removed = entities.remove(entities.size() - 1);
            System.out.println("생물이 삭제 되었습니다 : " + removed.getName());
        } else {
            System.out.println("삭제할 생물이 없습니다.");
        }
    }

    public void clear() {
        entities.clear();
        System.out.println("모든 정보를 삭제했습니다.");
    }

    public void show() {
        if (!entities.isEmpty()) {
            BiologicalEntity<T> latest = entities.get(entities.size() - 1);
            System.out.println("최신 등록 생물 : " + latest);
        } else {
            System.out.println("출력할 생물이 없습니다.");
        }
    }

    public boolean isEmpty() {
        return entities.isEmpty();
    }
}

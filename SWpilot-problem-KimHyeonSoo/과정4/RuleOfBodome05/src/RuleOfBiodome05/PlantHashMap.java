package RuleOfBiodome05;
import java.util.LinkedList;
import java.util.List;

class PlantHashMap<K, V> {
    private List<Entry<K, V>>[] table;
    private static final int SIZE = 16;

    @SuppressWarnings("unchecked")
    public PlantHashMap() {
        table = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // 값 덮어쓰기
                System.out.println("'" + key + "' 값이 업데이트 되었습니다: '" + value + "'");
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
        System.out.println("'" + key + "' 추가: '" + value + "'");
    }

    public void get(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                System.out.println("'" + key + "' 검색: '" + entry.value + "'");
                return;
            }
        }
        System.out.println("'" + key + "' 검색: 해당 식물이 존재하지 않습니다.");
    }

    public void remove(K key) {
        int index = getIndex(key);
        List<Entry<K, V>> bucket = table[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry);
                System.out.println("'" + key + "' 삭제: '" + key + "'와 그 특징이 삭제되었습니다.");
                return;
            }
        }
        System.out.println("'" + key + "' 삭제: 해당 식물이 존재하지 않습니다.");
    }

    public int getIndex(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
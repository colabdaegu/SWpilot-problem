package RuleOfBiodome06;

import java.util.*;

class AnimalFrequencyAnalyzer {
    private HashMap<String, Integer> animalCountMap = new HashMap<>();

    // 분석
    public void analyzeAnimalFrequencies(String[] animals) {
        for (int i = 0; i < animals.length; i++) {
            String animal = animals[i].trim();
            animalCountMap.put(animal, animalCountMap.getOrDefault(animal, 0) + 1);
        }
    }

    // 가장 많이 등장한 동물
    public List<String> getMostFrequentAnimals() {
        int maxCount = 0;

        for (int count : animalCountMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        List<String> result = new ArrayList<>();
        for (String animal : animalCountMap.keySet()) {
            if (animalCountMap.get(animal) == maxCount) {
                result.add(animal);
            }
        }

        Collections.sort(result);
        return result;
    }

    // 모든 동물 반환
    public List<String> getAllUniqueAnimals() {
        List<String> result = new ArrayList<>(animalCountMap.keySet());
        Collections.sort(result);
        return result;
    }
}

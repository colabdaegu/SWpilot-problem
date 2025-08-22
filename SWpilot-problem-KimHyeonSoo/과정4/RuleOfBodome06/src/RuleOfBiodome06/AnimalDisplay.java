package RuleOfBiodome06;

import java.util.List;

class AnimalDisplay {
    private AnimalFrequencyAnalyzer analyzer;

    public AnimalDisplay(AnimalFrequencyAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    public void printMostFrequentAnimals() {
        List<String> mostFrequent = analyzer.getMostFrequentAnimals();
        System.out.print("가장 많이 발견된 동물 : ");
        for (int i = 0; i < mostFrequent.size(); i++) {
            System.out.print(mostFrequent.get(i));
            if (i != mostFrequent.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void printAllUniqueAnimals() {
        List<String> allAnimals = analyzer.getAllUniqueAnimals();
        System.out.print("관찰된 모든 동물 : ");
        for (int i = 0; i < allAnimals.size(); i++) {
            System.out.print(allAnimals.get(i));
            if (i != allAnimals.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
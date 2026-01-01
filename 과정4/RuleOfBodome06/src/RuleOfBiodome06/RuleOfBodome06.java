package RuleOfBiodome06;

public class RuleOfBodome06 {
    public static void main(String[] args) {
        String input = String.join(" ", args);

        String[] arr = input.replace("[", "").replace("]", "").split(",");

        if (arr.length < 20) {
            System.out.println("20마리 이상의 동물이 입력되어야 합니다.");
            return;
        }

        AnimalFrequencyAnalyzer analyzer = new AnimalFrequencyAnalyzer();
        analyzer.analyzeAnimalFrequencies(arr);

        AnimalDisplay printer = new AnimalDisplay(analyzer);
        printer.printMostFrequentAnimals();
        printer.printAllUniqueAnimals();
    }
}
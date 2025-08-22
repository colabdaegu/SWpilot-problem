package BiodomeFamily03;

public class Plant extends Organism {
    private String month;
    private String hasFruit;

    // 선인장, 식물, 사막, 11월, 열매 있음
    public Plant(String name, String habitat, String month, String hasFruit) {
        super(name, "식물", habitat);
        this.month = month;
        this.hasFruit = hasFruit;
    }

    public String getMonth() {
        return month;
    }

    public String getHasFruit() {
        return hasFruit;
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat() + ", " + month + ", " + hasFruit);
    }
}

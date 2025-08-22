package BiodomeFamily03;

public class Animal extends Organism {
    private String digestion;
    private String food;

    // 펭귄, 동물, 남극, 육식, 물고기
    public Animal(String name, String habitat, String digestion, String food) {
        super(name, "동물", habitat);
        this.digestion = digestion;
        this.food = food;
    }

    public String getDigestion() {
        return digestion;
    }

    public String getFood() {
        return food;
    }

    @Override
    public void displayInfo() {
        System.out.println(getName() + ", " + getSpecies() + ", " + getHabitat() + ", " + digestion + ", " + food);
    }
}

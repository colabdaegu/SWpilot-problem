package RuleOfBiodome04;

class BiologicalEntity<T extends Feature> {
    private String name;
    private String category;
    private T feature;

    public BiologicalEntity(String name, String category, T feature) {
        this.name = name;
        this.category = category;
        this.feature = feature;
    }

    public String getName() {
        return name;
    }

    public T getFeature() {
        return feature;
    }

    @Override
    public String toString() {
        return name + ", " + category + ", " + feature.toString();
    }
}
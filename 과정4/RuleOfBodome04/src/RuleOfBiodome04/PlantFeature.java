package RuleOfBiodome04;

class PlantFeature implements Feature {
    private String flowerColor;
    private String hasFruit;
    private String bloomSeason;

    public PlantFeature(String flowerColor, String hasFruit, String bloomSeason) {
        this.flowerColor = flowerColor;
        this.hasFruit = hasFruit;
        this.bloomSeason = bloomSeason;
    }

    @Override
    public String toString() {
        return flowerColor + ", " + hasFruit + ", " + bloomSeason;
    }
}
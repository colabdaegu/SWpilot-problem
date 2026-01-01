package RuleOfBiodome04;

class AnimalFeature implements Feature {
    private String behavior;
    private String reproductionType;
    private String lifespan;

    public AnimalFeature(String behavior, String reproductionType, String lifespan) {
        this.behavior = behavior;
        this.reproductionType = reproductionType;
        this.lifespan = lifespan;
    }

    @Override
    public String toString() {
        return behavior + ", " + reproductionType + ", " + lifespan;
    }
}
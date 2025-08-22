package RuleOfBiodome04;

class MicrobeFeature implements Feature {
    private String environment;
    private String metabolism;

    public MicrobeFeature(String environment, String metabolism) {
        this.environment = environment;
        this.metabolism = metabolism;
    }

    @Override
    public String toString() {
        return environment + ", " + metabolism;
    }
}

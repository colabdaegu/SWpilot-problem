package BiodomeFamily02;

public class Organism {
    private String name;
    private String type;
    private String habitat;

    Organism(String name, String type, String habitat) {
        this.name = name;
        this.type = type;
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getHabitat() {
        return habitat;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setType(String type) {
    	this.type = type;
    }
    
    public void setHabitat(String habitat) {
    	this.habitat = habitat;
    }
    

    public void displayInfo() {
    	System.out.println(name + ", " + type + ", " + habitat);
    }
}
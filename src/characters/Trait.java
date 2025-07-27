package characters;

public class Trait {
    private String name; // name of the trait like charming
    private String description; // Flavor text
    private String type; //personality, social, stat-mod
    private String effectDescription; //what it does mechanically like +2 charisma

public Trait(String name, String description, String type, String effectDescription) {
    this.name = name;
    this.description = description;
    this.type = type;
    this.effectDescription = effectDescription;
    }
public void applyEffect(PlayerCharacter character){
    if (name.equalsIgnoreCase("Charming")){
        character.getStats().boostCharisma(2);
    }
}
    public String toString(){
        return name + " (" + type + "): " + description + "\nEffect" + effectDescription;

    }

}

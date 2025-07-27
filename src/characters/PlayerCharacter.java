package characters;

// Represents the main character created by the player
public class PlayerCharacter {
    private String name; //Name of the character
    private Trait trait; // The trait chosen by the player, which modifies stats
    private Stats stats; // The characters core attributes (HP, DEX, STR, INT, CHA

    // Constructor: builds a player character from name, trait choice number, and base stats
    public PlayerCharacter(String name, int traitChoice, Stats stats) {
        this.name = name;

        // Trait selection switch block
        switch (traitChoice) {
            case 1: // Trait: Tough
                this.trait = new Trait(
                        "Tough",                // Trait name
                        "You can take a beating!",    // Flavor text
                        "Stat-mod",                   // Type of trait
                        "+10 hp"                      // Trait bonus
                );
                // Applies +10 hp if player is tough
                this.stats = new Stats(
                        stats.getHp() + 10,
                        stats.getStrength(),
                        stats.getDexterity(),
                        stats.getIntelligence(),
                        stats.getCharisma()
                );
                break;

            case 2: // Trait: Clever
                this.trait = new Trait(
                            "Clever",
                        "You learn fast and adapt even faster.",
                             "Stat-mod",
                        "+1 Intelligence"
                );
                // Applies +1 INT if player is Clever
                this.stats = new Stats(
                        stats.getHp(),
                        stats.getStrength(),
                        stats.getDexterity(),
                        stats.getIntelligence() + 1,
                        stats.getCharisma()
                );
                break;

            case 3: // Trait: Fast
                this.trait = new Trait(
                        "Fast",
                        "Quick on your feet, quicker with your hands.",
                        "Stat-mod",
                        "+1 dexterity"
                );
                // Applies +1 DEX if player is fast
                this.stats = new Stats(
                        stats.getHp(),
                        stats.getStrength(),
                        stats.getDexterity() + 1,
                        stats.getIntelligence(),
                        stats.getCharisma()
                );
                break;

            default: // Fallback if input is invalid
                System.out.println("Invalid choice, defaulting to 'Tough'");
                this.trait = new Trait(
                        "Tough",
                        "You can take a beating!",
                        "Stat-mod",
                        "+10 hp"
                );
                // Default to tough: +10 hp
                this.stats = new Stats(
                        stats.getHp() + 10,
                        stats.getStrength(),
                        stats.getDexterity(),
                        stats.getIntelligence(),
                        stats.getCharisma()
                );
                break;
        }
        trait.applyEffect(this); //Applies trait effect after setting stats *stat boost*
    }

    // Prints character info (name, trait details, and stats)
    public void printCharacterInfo() {
        System.out.println("Character created!");
        System.out.println("Name: " + name);
        System.out.println("Trait: " + trait); // Uses Trait.toString()
        stats.printStats(); // Calls print method on stats object
    }

    // Getter for stats, used by other classes (like Trait to apply effects)
    public Stats getStats() {
        return stats;
    }

}


package characters;

public class Stats {
    private int hp;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int charisma;


    public Stats(int hp, int strength, int dexterity, int intelligence, int charisma) {
        this.hp = hp;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.charisma = charisma;
    }

    public int getHp() { return hp; }
    public int getStrength() { return strength; }
    public int getDexterity() { return dexterity; }
    public int getIntelligence() { return intelligence; }
    public int getCharisma() {return charisma; }

    public void printStats() {
        System.out.println("=== Character Stats ===");
        System.out.println("HP: " + hp);
        System.out.println("STR: " + strength);
        System.out.println("DEX: " + dexterity);
        System.out.println("INT: " + intelligence);
    }
    public void boostCharisma(int amount){
        this.charisma += amount;
    }
}

package Game;

import Utils.Dice;
import characters.PlayerCharacter;
import characters.Stats;

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// (Character Creation)
System.out.print("Enter your characters name: ");
String name = input.nextLine();

// Prompt user to choose a "trait" (which will influence stats)
System.out.println("Choose a trait:\n1. Tough\n2. Clever\n3. Fast");
int trait = input.nextInt();

// (Stat rolling)
System.out.println("Rolling your stats...");
int hp = 40 + Dice.roll(10); //Base hp is 40 + a d10 roll for variation
int str = Dice.rollStat(); // Roll a stat value for strength
int dex = Dice.rollStat(); // Roll a stat value for dexterity
int intel = Dice.rollStat(); // Roll a stat value for intelligence
int cha = Dice.rollStat(); // Roll a stat value for charisma

// Create a stats object with the rolled values
Stats rolledStats = new Stats(hp, str, dex, intel, cha);

// Prints out the rolled stats before applying trait effects
rolledStats.printStats();

// ***Creates the Character***
PlayerCharacter player = new PlayerCharacter(name, trait, rolledStats); // Pass name, trait, and stats to the constructor

// Prints final character info, including any trait effects
player.printCharacterInfo();

        }
    }

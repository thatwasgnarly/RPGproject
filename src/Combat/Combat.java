package Combat;
import characters.PlayerCharacter;
import characters.Enemy;
import Utils.Dice;
import java.util.Scanner;
public class Combat {
    public static void startCombat(PlayerCharacter player, Enemy enemy){
        Scanner scanner = new Scanner(System.in);
        System.out.println("A wild " + enemy.getName() + "Appears!");
        System.out.println(enemy);
    }

}

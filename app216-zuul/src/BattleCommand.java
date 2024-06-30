import java.util.Scanner;
import java.util.Random;
/**
 * BattleCommand will allow the user to fight villans in the game
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public class BattleCommand extends ZuulCommand
{
    private Random random;
    private Scanner reader;
    public BattleCommand(Game zuul)
    {
        super(zuul);
        this.random = new Random();
        reader = new Scanner(System.in);
    }

    public void execute()
    {
        Map map = zuul.MAP;
        Player player = zuul.player;
        Evil evil = zuul.evil;

            while (player.getHealth() > 0 && evil.getHealth() > 0) {
                int randoms = random.nextInt(3) + 1;
                if (randoms == 1) {
                    System.out.println("Azraun throws a curse at you, what are you going to do?");
                    System.out.println("Use Bible");
                    System.out.println("Run away");
                    System.out.println("Attack");
                    switch (getString()) {
                        case "attack":
                            System.out.println("You decided to attack  " +
                                    "but while he cast the curse spell, an invisible shield protects him." +
                                    "After you hit the shield you loose 2 health points. The curse makes you " +
                                    "loose 10 health points");
                            player.decreaseHealth(12);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azraun's health: " + evil.getHealth());
                            break;
                        case "run away":
                            System.out.println("Azraun sealed all exits, remember ? After the curse," +
                                    "you lose 10 health points");
                            player.decreaseHealth(10);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azrraun's health: " + evil.getHealth());
                            break;
                        case "use bible":
                            System.out.println("The Holy Bible protects you from the curse of Azraun ");
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azraun's health: " + evil.getHealth());

                    }
                }
                if (randoms == 2) {
                    System.out.println("Azraun tries a direct attack at you. What are you going to do?");
                    System.out.println("Counter attack");
                    System.out.println("Defend");
                    System.out.println("Evade");

                    switch (getString()) {
                        case "counter attack":
                            System.out.println("You hit him hard, he didn't expected that move. You get injured and lose " +
                                    "2 health points, but he loses 10 health points");
                            player.decreaseHealth(2);
                            evil.decreaseHealth(10);
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azraun's health: " + evil.getHealth());
                            break;
                        case "defend":
                            System.out.println("You try to defend Azraun's attack but he's more powerful, you are" +
                                    "injured and lose 5 health points");
                            player.decreaseHealth(5);
                        case "evade":
                            System.out.println("You successfully evade the Unholy Dark Knight's attack");
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azraun's health: " + evil.getHealth());
                            break;

                    }
                }
                if (randoms == 3) {
                    System.out.println("Azraun is just staying in front of you, laughing in your face." +
                            "What are you going to do ? ");
                    System.out.println("Wait");
                    System.out.println("Attack");

                    switch (getString()) {
                        case "wait":
                            System.out.println("There's no time for that, the world is in danger !");
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azraun's health: " + evil.getHealth());
                            break;
                        case "attack":
                            System.out.println("Great job, you surprise The Unholy Dark Knight with a full strength attack !");
                            evil.decreaseHealth(player.getDamage());
                            System.out.println("Health: " + player.getHealth() + " , " + "Damage: " + player.getDamage() + " : " + " Azraun's health: " + evil.getHealth());
                            break;
                    }

                }

            }
    }

    /**
     * Fetches the users input.
     */
    public String getString()
    {
        String inputLine = "";
        System.out.print(" > ");
        inputLine = reader.nextLine().toLowerCase();
        return inputLine;
    }
}

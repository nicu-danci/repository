/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  locations, creates the CommandReader and starts the game.  
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */

public class Game 
{
    public final Map MAP;
    private CommandReader reader;
    private boolean gameOver;
    public Player player;
    public Evil evil;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        MAP = new Map();
        reader = new CommandReader(this);
        player = new Player();
        evil = new Evil();

    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();
        gameOver = false;
        // Enter the main command loop.  Here we repeatedly
        // read commands and execute them until the game is over.
        while(!gameOver && evil.getHealth() > 0 && player.getHealth() > 0)
        {
            gameOver = reader.getCommand();
        }

        if (evil.getHealth() <= 0)
        {
            System.out.println("You are the champion Berold of the Light. Azraun is forever gone and the Totem of " +
                    "Life restored the life and prosperity in Obregon. The Kingdom shall always be in your debt.");
        }
        else if(player.getHealth() <= 0)
        {
            System.out.println("Azraun : You fools, you cannot defeat the almighty Azraun !!! " +
                    "Your faith is doomed forever.");
            System.out.println("Game over.");
        }
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println(" Welcome to the World of Obregon!");
        System.out.println(" After the Totem of Life was stolen by the Demon Azraun, the legendary Kingdom of Obregon" +
                " fell into a dark and cold era. The King held a tournament to find the one with a pure heart that" +
                " can defeat Azraun. Many have tried to win but only one triumphed. Berold of the Light vowed to" +
                " retrieve the Totem of Live and return Obregon to its formal glory. And so the quest begins..");
        System.out.println(" Type 'help' if you need help.");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());
    }
}

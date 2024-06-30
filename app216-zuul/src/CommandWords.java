
/**
 * This contains all the possible command words
 * for the game of Zuul
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public enum CommandWords
{
    GO   ("go","Exit location in <direction>"),
    TAKE ("take", "Take <item> from location"),
    HELP ("help", "List all available commands"),
    BACKPACK("backpack", "List all items available in the inventory"),
    USE ("use","can use the item to increase the player's stats"),
    FIGHT("fight", "starts the fighting mode"),
    QUIT ("quit", "End the game");
    
    public final String word;
    public final String description;
    
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}

import java.util.ArrayList;
/**
 * The InventoryCommand will print out the item the player is currently have in their inventory.
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public class BackPackCommand extends ZuulCommand
{
    public BackPackCommand(Game zuul)
    {
        super(zuul);
    }
    /**
     * Prints out the item that the player currently has.
     */
    public void execute()
    {
        System.out.println();
        Player player = zuul.player;
        System.out.println(player.getItemString());
    }
}
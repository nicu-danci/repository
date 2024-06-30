/**
 * The UseCommand allows the player to the user the item in their inventory, which can boost the player's status or even unlock a new location.
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public class UseCommand extends ZuulCommand
{
    String item;
    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public UseCommand(Game zuul, String item)
    {
        super(zuul);
        this.item = item;
    }

    /**
     * Checks if the item is in the backpac, if it is then they can modify player's status
     */
    public void execute()
    {
        if(item == null)
        {
            // if there is no second word, we don't know what to take...
            System.out.println("What am I using?");
            return;
        }
        Map map = zuul.MAP;
        Player player = zuul.player;
        Item items = player.getItem(item);
        if(items == null)
        {
            System.out.println("The item doesn't exist!");
        }
        else if(items.getName().equals("armor"))
        {
            player.increaseHealth(10);
            System.out.println("Equipping your armor, your health is increased by 10");
            player.removeItems(item);
            System.out.println("You now have "+ player.getHealth() + " health");
        }

        else if(items.getName().equals("sword"))
        {
            player.setDamage(15);
            System.out.println("Great choice, your attack has increased by 10");
            System.out.println(map.getCurrentLocation().getLongDescription());
            player.removeItems(item);
        }

        else if(items.getName().equals("bible"))
        {
            player.increaseHealth(10);
            System.out.println("Health increased by10");
            System.out.println(map.getCurrentLocation().getLongDescription());
            player.removeItems(item);
        }
        else if(items.getName().equals("food"))
        {
            player.increaseHealth(5);
            System.out.println("Health increased by 5");
            System.out.println(map.getCurrentLocation().getLongDescription());
            player.removeItems(item);
        }

        else if(items.getName().equals("shield"))
        {
            player.increaseHealth(8);
            System.out.println("Health increased by 8");
            System.out.println(map.getCurrentLocation().getLongDescription());
            player.removeItems(item);
        }

        else
        {
            System.out.println("You don't have that item.");
        }
    }

}

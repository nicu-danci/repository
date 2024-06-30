import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
/**
 * This is the player class, to set the player's attribute and update its status such as health,
 * damage, luck, etc. Used getter and setter methods to update the player.
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public class Player
{
    private int health = 10;
    private int damage = 10;
    public ArrayList <Item> backpack;
    public HashMap <String, Item> backpacks;
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        this.health = health;
        this.damage = damage;
        backpack = new ArrayList <>();
        backpacks = new HashMap <>();
    }

    /**
     * Decrease health of  player.
     */
    public void decreaseHealth()
    {
        decreaseHealth(10);
    }

    /**
     * Set the damage of the player, depending on what Item it obtained.
     */
    public void setDamage(int set)
    {
        damage = set;
    }

    /**
     * Return the player's damage.
     */
    public int getDamage()
    {
        return damage;
    }

    /**
     * Find the item in the player's backpack.
     */
    public Item findItem(String item)
    {
        for(Item items: backpack)
        {
            if(items.getName().equals(item))
            {
                return items;
            }
        }
        return null;
    }

    /**
     * Increase the player's health
     */
    public void increaseHealth(int amount)
    {
        health = health + amount;
    }

    /**
     * Decrease the player's health
     */
    public void decreaseHealth(int amount)
    {
        health = health - amount;
    }


    /**
     * Add an item into the player's backpack.
     */
    public void addItem(Item item)
    {
        backpack.add(item);
    }

    /**
     * Remove an item from backpack.
     */
    public void removeItem(Item item)
    {
        backpack.remove(item);
    }

    /**
     * Get the player's health.
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * Set the item's name and the item itself to the player's inventory.
     */
    public void setItem(String name, Item item)
    {
        backpacks.put(name, item);
    }

    /**
     * Remove the item from plater's backpack.
     */
    public Item removeItems(String item)
    {
        return backpacks.remove(item);
    }

    /**

     */
    public Item getItem(String item)
    {
        return backpacks.get(item);
    }

    /**
     * Checks if the player's has red moon-key, white moon-key and black moon-key to unlock dark knight's lair.
     */

    /**
     * Get the item string that the player has in his backpack.
     */
    public String getItemString()
    {
        String returnString = " Inventory:";
        Set <String> keys = backpacks.keySet();
        for(String item: keys)
        {
            returnString += " " + item;
        }
        return returnString;
    }
}
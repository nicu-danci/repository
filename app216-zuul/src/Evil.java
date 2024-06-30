/**
 * The Enemy only has one attribute "health" that can be reduced by the player.
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public class Evil
{
    // instance variables - replace the example below with your own
    private int health = 50;

    public Evil()
    {
        this.health = health;
    }

    /**
     * Decrease the enemy's health.
     */
    public void decreaseHealth(int amount)
    {
        health = health - amount;
    }

    /**
     * Get the enemy's health.
     */
    public int getHealth()
    {
        return health;
    }
}
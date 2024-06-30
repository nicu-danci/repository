

/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
    public class Map
    
    
{
    // Need to add a list of exits

    protected Location castle, blacksmith, outside, mill, forest, priest, cemetery, grounds, oracle, house, lair;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createCastle();
        createBlacksmith();
        createOutside();
        createMill();
        createForest();
        createPriest();
        createCemetery();
        createGrounds();
        createOracle();
        createHouse();
        createLair();

        currentLocation = castle;  // start game in the castle
    }

    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createCastle()
    {
        castle = new Location("inside the castle walls, the safest place in the kingdom");

    }

    /**
     * Create the pub and link it to the outside
     */
    private void createBlacksmith()
    {
        blacksmith = new Location("in the blacksmith. Take whatever you think necessary for the journey ahead." +
                "YOu can take : a sword, an armor and a bible");

        blacksmith.setExit("west", castle);
        castle.setExit("east", blacksmith);

        blacksmith.setItem("armor",new Item("armor", "The best armor to fight the dark side"));
        blacksmith.setItem("sword", new Item("sword", "The legendary Excalibur sword"));
        blacksmith.setItem("bible", new Item("bible", "The word of God"));
    }

    /**
     * Create the theatre linked to the outside
     */
    private void createOutside()
    {
        outside = new Location("outside of the castle walls");

        outside.setExit("south", castle);
        castle.setExit("north", outside);
    }

    /**
     * Create the office linked to the lab
     */
    private void createMill()
    {
        mill = new Location("in an abandoned mill. You have found some food.");

        mill.setExit("east",outside);
        outside.setExit("west", mill);

        mill.setItem("food", new Item("food","Food increases your health "));
    }

    /**
     * Create the lab and link it to the outside and office
     */
    private void createForest()
    {
        // create the Locations
        forest = new Location("in a dark forest");

        forest.setExit("south", outside);
        outside.setExit("north",forest);
    }

    private void createPriest()
    {
        priest = new Location("at a holy priest's house. He blesses you and will pray for you to have " +
                "the power to defeat the evil");

        priest.setExit("west", forest);
        forest.setExit("east", priest);

    }

    private void createCemetery()
    {
        cemetery = new Location("in the town cemetery. Nothing here just some long forgotten souls");

        cemetery.setExit("east", forest);
        forest.setExit("west", cemetery);

    }

    private void createGrounds()
    {
        grounds = new Location("on haunted grounds, the Black Knight lair is near");

        grounds.setExit("south", forest);
        forest.setExit("north", grounds);
    }

    private void createOracle()
    {
        oracle = new Location("at the Oracle. You don't really have the time for riddles and predictions " +
                "right ?");

        oracle.setExit("west", grounds);
        grounds.setExit("east", oracle);


    }

    private void createHouse()
    {
        house = new Location("inside a haunted house");

        house.setExit("east", grounds);
        grounds.setExit("west", house);
        priest.setItem("shield",new Item("shield","A shield to protect you in the battle ahead" +
                "holly priest"));
    }

    public Player player;

    private void createLair()

    {
        lair = new Location("in Azraun's lair");

            grounds.setExit("north", lair);

    }
    public Location getCurrentLocation()
    {
        return currentLocation;
    }

    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
import java.util.ArrayList;
/**
 * Write a description of class HelpCommand here.
 *
 * @author Nicoara Danci
 * @version 20/02/2022
 */
public class HelpCommand extends ZuulCommand
{
    public HelpCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and
     * a list of the command words.
     */
    public void execute()
    {
        System.out.println(" You are lost. You are alone. Try to focus on the current task");
        System.out.println("                        Azrraun's Lair");
        System.out.println("                               |" );
        System.out.println("Haunted house    ------- Cursed grounds -------- The oracle");
        System.out.println("                               |" );
        System.out.println("Town Cemetery    ------- Dark Forest -------- Priest");
        System.out.println("                               |" );
        System.out.println("Abandoned Mill   ------- Outside castle walls -------- ");
        System.out.println("                               |" );
        System.out.println("                 -------   Castle -------- The blacksmith");

        System.out.println(" Your command words are:");
        System.out.println();
        
        for(CommandWords command : CommandWords.values())
        {
            System.out.println(" " + command.word + 
                               "\t  : " + command.description);                        
        }   
        System.out.println();
        System.out.println(" e.g. go west, take gold");
        System.out.println();
        System.out.println(zuul.MAP.getCurrentLocation().getLongDescription());
    }
}

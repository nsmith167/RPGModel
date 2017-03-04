/**
 * 
 * @author Nathan
 * 
 * This class is a collection of Areas to be used in the game.
 * 
 * The purpose is to define the characteristics of the three main areas and 
 * provide interfaces for interacting with them.
 */
public class AreaModel 
{
    private Area burningBush;
    private Area temple;
    private Area abandonedHut;
    private Area nePassage;
    private Area nwPassage;
    private Area ewPassage;
    
    public AreaModel()
    {
        burningBush = new Area("Burning Bush");
        burningBush.setNeighbors(nwPassage, ewPassage);
        burningBush.setNeighborDirections("south east", "east");
        burningBush.addSurrounding(new Item("bush", "center of the clearing", "It's a small bush on fire. It doesn't seem to be consumed by the fire."));
        burningBush.addSurrounding(new Item("key", "center of the bush", "an ordinary brass key glowing from the heat of the fire"));
        burningBush.setDescription("You come into a clearing in the woods. There doesn't seem to be anything but a small"
                + "bush on fire in the middle of the clearing.");
    }
}

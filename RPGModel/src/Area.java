
import java.util.ArrayList;

/**
 *
 * @author Nathan
 */
public class Area implements Inspectable
{
    private String name;
    private ArrayList<Item> surroundings = new ArrayList<Item>();
    private String description;
    private Area[] neighbors = new Area[2];
    private String[] neighborDirections = new String[2];

    public Area(String name)
    {
        this.name = name;
    }
    
    @Override
    public String inspect() 
    {
        return getDescription();
    }

    public String getName() 
    {
        return name;
    }

    public ArrayList<Item> getSurroundings() 
    {
        return surroundings;
    }

    public void addSurrounding(Item object) 
    {
        this.surroundings.add(object);
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }
    
    public void setNeighbors(Area neighbor1, Area neighbor2)
    {
        neighbors[0] = neighbor1;
        neighbors[1] = neighbor2;
    }
    
    public void setNeighborDirections(String direction1, String direction2)
    {
        neighborDirections[0] = direction1;
        neighborDirections[1] = direction2;
    }
}

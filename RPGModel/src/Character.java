/**
 *
 * @author Nathan
 */
public class Character 
{
    private String name;
    private final Item[] bag;
    private int nextFreeSpace;
    private String notebook;
    private Area location;

    public Character(String name, Area start) 
    {
        this.name = name;
        this.bag = new Item[10];
        this.nextFreeSpace = 0;
        this.notebook = "";
        location = start;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getBagContents() 
    {
        return bag.toString();
    }
    
    public void pickUp(Item item)
    {
        bag[nextFreeSpace] = item;
        bag[nextFreeSpace].setBagIndex(nextFreeSpace);
        nextFreeSpace++;
    }
    
    public void drop(Item item)
    {
        bag[item.getBagIndex()] = null;
        nextFreeSpace--;
    }
    
    public String getNotebook() 
    {
        return notebook;
    }

    public void setNotebook(String notebook) 
    {
        this.notebook = notebook;
    }
    
    public void setLocation(Area location)
    {
        this.location = location;
    }
    
    public Area getLocation()
    {
        return this.location;
    }
}

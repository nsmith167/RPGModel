/**
 *
 * @author Nathan
 */
public class Item implements Inspectable
{
    private String name;
    private String location;
    private String description;
    private int bagIndex;
    
    public Item(String name, String location, String description)
    {
        this.name = name;
        this.location = location;
        this.description = description;
        this.bagIndex = 0;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public String getLocation()
    {
        return this.location;
    }
    
    public void setBagIndex(int index)
    {
        this.bagIndex = index;
    }
    
    public int getBagIndex()
    {
        return this.bagIndex;
    }
    
    @Override 
    public String inspect()
    {
        return description;
    }
    
    public void use()
    {
        System.out.println("You used " + this.name);
    }
    
    public void useOn(Item item)
    {
        System.out.println("You used " + this.name + " on " + item.getName() + ".");
    }
}

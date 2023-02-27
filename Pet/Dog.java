
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Pet
{
    // instance variables - replace the example below with your own
    private int weight;

    /**
     * Constructor for objects of class Dog
     */
    public Dog(String name, int weight)
    {
        // initialise instance variables
        super(name);
        this.weight = weight;
        
    }

    public String speak(){
        return "woof";
        
    }
    
    public String move(){
        return "I am walking with four legs";
    
    }
   
}


/**
 * Write a description of class Cobra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cobra extends Snake
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Cobra
     */
    // if you dont call the parent constructor, it will implicitly call the default constructor
    // it implicitly calls the default constructor (of Snake) 
    // cant make a child without a parent
    //private boolean poisonous;
    public Cobra(int len)
    {
        // super() must be the first statement in a child constructor
        super(len);
        poisonous = true;
        
        // call Snake();
        // initialise instance variables
        x = 0;
    }
    
    /*bite will poison another animal 
     * @param Animal object
       */
      // polymorphic
      // Object() is polymorophic
      // Is-a relationship 
      // A cobra Is-a(n) animal
      // Dont put Object in here, because it doesn't have the poisoned variable
      // you could, but you would have to cast it as Animal
    public void bite(Animal poorThing){
        //System.out.println(poorThing);
        poorThing.poisoned = true;
        System.out.println(poorThing);
    }
    
     
    
}

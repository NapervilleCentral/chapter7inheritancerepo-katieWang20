
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat extends Pet
{
    // instance variables - replace the example below with your own
    private String mood;
    
    /**
     * Constructor for objects of class Cat
     */
    
    public Cat(String name, String mood)
    {
        // initialise instance variables
        super(name);
        this.mood = mood;
        species = "cat";
    }
    
    public String speak(){
        return "meow" ;
    }

    public String move(){
        return "strutting";
    }
    
    public String toString(){
        return super.toString() + " and I am " + mood;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    
}

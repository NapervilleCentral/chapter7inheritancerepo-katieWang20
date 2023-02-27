
/**
 * Write a description of class Iguana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Iguana extends Pet
{
    // instance variables - replace the example below with your own
    private String color;
    private double length;

    /**
     * Constructor for objects of class Iguana
     */
    public Iguana(String name, String color, double length)
    {
        // initialise instance variables
        super(name);
        this.color = color;
        this.length = length;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String move()
    {
        return "I am crawling";
    }
    
    public String speak() {
        return "I am hissing";
    }
}

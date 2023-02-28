
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
    protected String species = "iguana";
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
        return "hissing";
    }
    
    public String toString(){
        return super.toString() + " and my length in inches is " + length + " and I am the color " + color;
    }
}

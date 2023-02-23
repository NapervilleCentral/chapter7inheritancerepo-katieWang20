
/**
 * Write a description of class Avian here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Avian extends Animal
{
    // instance variables - replace the example below with your own
    private int x;
    boolean canFly;
    boolean isFlying;
    String color;
    double wingspan;
    
    
    /**
     * Constructor for objects of class Avian
     */
    public Avian(String color, double wingspan, boolean canFly)
    {
        super("bird");
        
        this.color = color;
        this.wingspan = wingspan;
        this.canFly = canFly;        
        
    }
    
    public void fly(){
        System.out.println("I am flying");
    }


}

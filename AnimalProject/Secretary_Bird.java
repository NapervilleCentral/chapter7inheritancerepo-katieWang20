
/**
 * Write a description of class Secretary_Bird here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Secretary_Bird extends Avian
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Secretary_Bird
     */
    
    public Secretary_Bird(String color, double wingspan, boolean canFly)
    {
        // initialise instance variables
        super(color, wingspan, canFly);
        
    }
    
    public String move(){
        if (canFly == true){
            return "flying";
        }else{
            return "running";
        }
    }
    
    public String toString(){
        return super.toString() + "\nI am a " + color + " secretary bird with a wingspawn of " + wingspan + " inches or centimeters idk"; 
    }
    
}

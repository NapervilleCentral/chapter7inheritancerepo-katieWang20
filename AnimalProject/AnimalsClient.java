

public class AnimalsClient
{
   //-----------------------------------------------------------------
   /**  Instantiates a Animal and Reptile object and prints information
   //  about them.
   */
   public static void main (String[] args)
   {
    // you dont make an abstract class
      //Animal bob = new Animal("Mammal");
      //System.out.println(bob  );

        //gets called implicitely if you dont explicitly call it
      //Reptile sue = new Reptile();
     // System.out.println(sue.getType()  );
      //System.out.println( sue );

        

        //Snake toString is called       
        Snake putin = new Snake (24);
        System.out.println(putin);
        
        Cobra me = new Cobra(22);
        me.bite(putin);
        
        Secretary_Bird secretary = new Secretary_Bird ("white", 30.3, true);
        
        me.bite(secretary);
       // System.out.println(secretary);
        
     /*
     /*
     */





   }
}

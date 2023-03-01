//********************************************************************
//  Pets.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of abstract classes.
//********************************************************************

import java.util.ArrayList;
import java.util.Scanner;
public class Pets
{
   //-----------------------------------------------------------------
   /**  Instantiates a dog, cat and a snake object and prints information
   //  about them.
   */
   public static void main (String[] args)
   {
    /*
      Pet Rex = new Dog("Rex",50);
      System.out.println(Rex.speak()  );

      Rex = new Cat("Lester");
      System.out.println(Rex.speak()  );
      
      Pet Bob = new Iguana("Bob", "blue", 12);
      System.out.println(Bob.speak());

      Dog fido = new Dog("Fido", 45);

      Cat boots = new Cat("PUSSinBOOTS");


      System.out.println();
      System.out.println(boots);
      System.out.println(boots.getName() + " says " + boots.speak());
      System.out.println(boots.move() + " " + boots.getName() + " ");


    System.out.println(fido);
    System.out.println(fido.getName() + " says " + fido.speak());
    System.out.println(fido.move() + " " + fido.getName() + " ");
    
    System.out.println();
      System.out.println(Bob);
      System.out.println(Bob.getName() + " says " + Bob.speak());
      System.out.println(Bob.move() + " ");

       //Snake sam = new Snake("Sam", 30);
        //Poodle hadley = new Poodle(65,"Cream", "Hadley");
    Lab Boston = new Lab(65,"Cream", "Boston");



      System.out.println(fido);
      System.out.println(fido.getName() + " says " + fido.speak());
      System.out.println(fido.move() + " " + fido.getName() + " "
                         );

    /*
     System.out.println(hadley);
     System.out.println(hadley.getName() + " says " + hadley.speak());
     System.out.println(hadley.move() + " " + hadley.getName() + " "
                 + hadley.move());




    /*
      System.out.println();
      System.out.println(sam);
      System.out.println(sam.getName() + " says " + sam.speak());
      System.out.println(sam.move() + " " + sam.getName() + " "
                         + sam.move());
    /**/


    ArrayList <Pet> kennel = new ArrayList <>();
    Scanner keyboard = new Scanner(System.in);
    
    Pet Rex = new Dog("Rex",50);
    kennel.add(Rex);

    Pet Lester = new Cat("Lester", "happy");
    kennel.add(Lester);
      
    Pet Bob = new Iguana("Bob", "blue", 12);
    kennel.add(Bob);
    
    boolean cont = true;
    int choice = 0, type = 0;
    String name;
    String species = "";
    while (cont == true)
    {
        System.out.println("What would you like to do? \n1) Check in \n2) Check out \n3)end \nDisplay \nMake a choice: ");
        choice = keyboard.nextInt();
        
        if (choice == 3 || choice == 2){
            System.out.println("What is the name of your pet?");
            name = keyboard.nextLine();
            name = keyboard.nextLine();
            
            System.out.println("What species is your pet? \n1) Dog \n2) Cat \n3)Iguana \nMake a choice: ");
            type = keyboard.nextInt();
                
            if (choice == 1) {
                
                
                    if (type == 1) {
                        species = "dog";
                        System.out.println("What is the weight of your dog?");
                        int weight = keyboard.nextInt();
                                    
                        Pet dog = new Dog(name, weight);
                        
                        kennel.add(dog);
                        
                        
                    }else if(type == 2){
                        species = "cat";
                        
                        System.out.println("What is the mood of your cat?");
                        String mood = keyboard.nextLine();
                        Pet cat = new Cat(name, mood);
                        
                        kennel.add(cat);
                        
                        
                    }else if (type == 3){ 
                        double length;
                        species = "Iguana";
                        
                        System.out.println("What is the color of your iguana?");
                        String color = keyboard.nextLine();
                        color = keyboard.nextLine();
                        
                        System.out.println("What is the length of your iguana (in inches)?");
                        length = keyboard.nextDouble();
                        
                        Pet iguana = new Iguana (name, color, length);
                        
                        kennel.add(iguana);
                        
                
                    }else{System.out.println("Not a valid choice");}
                    
                    
                    
            }else if(choice == 2) {
                //System.out.println("What species is your pet? \n1) Dog \n2) Cat \n3)Iguana \nMake a choice: ");
                //type = keyboard.nextInt();
                //System.out.println("What is the name of your pet?");
                //name = keyboard.nextLine();
                
                if (type == 1)
                    species = "dog";
                else if (type == 2)
                    species = "cat";
                else if (type == 3)
                    species = "iguana";
                else  
                   System.out.println("not a valid choice");
                
                for (int i = 0; i < kennel.size(); i ++){
                    Pet animal = kennel.get(i);
                    
                    if (animal.getName().equals(name) && animal.getSpecies().equals(species)){
                        
                        kennel.remove(i);
                    }else
                    { 
                    }
                    
                    
                    
                }
                int numOfDays;
                double cost;
                System.out.println("How many days was your pet in the kennel?");
                numOfDays = keyboard.nextInt();
                
                cost = (double) numOfDays * 30.0;
                
                System.out.println("You owe $"+ cost);
                
                double change;
                double pay;
                
                System.out.println("Enter how much you will pay");
                
                pay = keyboard.nextDouble();
                
                if (pay < cost){
                    System.out.println("Not enough");
                }else{
                    change = pay - cost;
                    System.out.println("Paid! Your change is $" + change);
                
                }
                
            
            //}else if (choice == 3){
                
            }else if (choice == 4){
                display(kennel);
            }
        }else if (choice == 3){
        
            System.out.println("program end");
                cont = false;
        }else if (choice == 4){
            
                display(kennel);
            
        }
    }
    
    

    
   }
   
   public static void display(ArrayList list){
        for (int i = 0; i < list.size(); i ++){
            Pet pet = (Pet) list.get(i); // cast it!!!
            System.out.println("Name: " + pet.getName());
            System.out.println("Species: " + pet.getSpecies());
            System.out.println();
        
        }
    }
}

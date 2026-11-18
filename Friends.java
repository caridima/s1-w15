import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {
    ArrayList<Name> names = new ArrayList<Name>();
    Random rand = new Random();
   // declare and initialize the ArrayList
   // declare and initialize the Random class
   
   // the constructor
   public Friends () {
    names.add(new Name("A", "B","C"));
    names.add(new Name("1", "2","3"));
    names.add(new Name("X", "Y","Z"));     
    // add three names to the ArrayList
   }
   
   public void printRandomFriend(){
       int x = (int)(Math.random()*names.size()+1);
       System.out.println(names.get(x));
       //return a random Name object from the List
    }
   
  
}
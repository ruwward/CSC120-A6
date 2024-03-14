/* This is a stub for the Library class */
import java.util.Hashtable;

public class Library extends Building{

  private Hashtable<String, Boolean> collection;

  public Library() {
    collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }
  
  public void addTitle(String title){
    collection.put(title, true);
  }

  public String removeTitle(String title){ // return the title that we removed
    collection.remove(title);
    return title;
  }

  public void checkOut(String title){
    collection.replace(title, false);
  }

  public void returnBook(String title){
    collection.replace(title, true);
  }

  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
    return collection.containsKey(title);
  }
  
  public boolean isAvailable(String title){ // returns true if the title is currently available, false otherwise
   return collection.get(title);
  }

  public void printCollection(){ // prints out the entire collection in an easy-to-read way (including checkout status)
    System.out.println(collection.toString());
  }

  public static void main(String[] args) {
    new Library();
  }
  
}
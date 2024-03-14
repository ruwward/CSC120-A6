/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  
  public House(Boolean hasDiningRoom) {
    residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }

  public boolean getDiningRoom() {
    return this.hasDiningRoom;
  }

  public int nResidents() {
    return residents.size();
  }

  public void moveIn(String name){
    residents.add(name);
  }

  public String moveOut(String name){ // return the name of the person who moved out
    residents.remove(name);
    return name;
  }

  public boolean isResident(String person){
    return residents.contains(person);
  }
  public static void main(String[] args) {
    new House();
  }

}
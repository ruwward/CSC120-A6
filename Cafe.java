/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces = 300; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets = 100; // The number of sugar packets remaining in inventory
    private int nCreams = 100; // The number of "splashes" of cream remaining in inventory
    private int nCups = 30; // The number of cups remaining in inventory

    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        if(this.nCoffeeOunces<nCoffeeOunces){  
            restock();
        }
        elif(this.nSugarPackets<nSugarPackets){  
            restock();
        }  
        elif(this.nCreams<nCreams){  
            restock();
        }  
        elif(nCups<1){  
            restock();
        }
    }

    private void restock(){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("restock complete!");
    }

    public static void main(String[] args) {
        Cafe Pete = new Cafe("Pete's", "123 Main St", 2);
    }
    
}

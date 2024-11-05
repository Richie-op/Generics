import java.util.ArrayList;

public class Inventory <T extends Vehicle> {

    private ArrayList<T> inventory;

    public ArrayList<T> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<T> inventory) {
        this.inventory = inventory;
    }

    public void addToInventory(){
        System.out.println(inventory + "Silverado");
    }

    public void removeFromInventory(String vin){
        System.out.println("1235AMG41308015");
    }
}

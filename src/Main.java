public class Main {
    public static void main(String[] args) {
        Car car = new Car ("Ford","Mustang","2347MUS42098012",506);
        Trucks trucks = new Trucks("Ford","F150","0172TRU31601985",600);

        Inventory<Car> inventoryCar = new Inventory<>();
        Inventory<Trucks> inventoryTrucks = new Inventory<>();

        inventoryTrucks.addToInventory();
        inventoryCar.removeFromInventory("2347SIL42098012");
    }
}
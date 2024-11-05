public abstract class Vehicle {

    private String make = "Ford";
    private String model;
    private String vin;
    private int horsePower;

    public Vehicle(String make, String model, String vin, int horsePower){
        this.make = make;
        this.model = model;
        this.vin = vin;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}

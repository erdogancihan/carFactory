package carfactory;

public class FireTruck extends Truck  {
    //Water amount of the Fire carfactory.Truck
    private Double waterAmount;

    public FireTruck(String color, int weight, byte doorCount, Double waterAmount) {
        super(color, weight, doorCount);
        this.waterAmount = waterAmount;
    }
    @Override
    public String signal() {
        return "Firetruck makes special signal:)";
    }

    @Override
    public  boolean putOutFire() {
        return true;
    }


}

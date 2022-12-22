package carfactory;

public class CraneTruck extends Truck {
    public CraneTruck(String color, int weight, byte doorCount) {
        super(color, weight, doorCount);
    }

    public static class TowTruck extends Truck {
        public TowTruck(String color, int weight, byte doorCount) {
            super(color, weight, doorCount);
        }
    }
}

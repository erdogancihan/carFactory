package carfactory;

/*
 *This is a Factory class. With these class you can create various types of cars.
 */
public class CarFactory {
    /*
     * @return Car This method returns a instance of a Car object.
     * @param CarModel This is the type of the car to be produced. That is an ENUM.
     * @param color This is the color of the car.
     * @param weight This is the weight of the car.
     * @param doorCount this is the door count of the car.
     * @param args Firetruck has waterAmount property also. When a Firetruck object is needed to be created this parameter must also be sended.
     * */
    public static Car getInstance(CarModel carModel, String color, int weight, byte doorCount, Double... args) {
        if (carModel == CarModel.FIRETRUCK) {
            //args[0] is for waterAmount for the FireTruck.
            return new FireTruck(color, weight, doorCount, args[0]);
        } else if (carModel == CarModel.CRANETRUCK) {
            return new CraneTruck(color, weight, doorCount);
        } else if (carModel == CarModel.TOWTRUCK) {
            return new TowTruck(color, weight, doorCount);
        } else if (carModel == CarModel.SEDAN) {
            return new SUV(color, weight, doorCount);
        } else if (carModel == CarModel.BUS) {
            return new Bus(color, weight, doorCount);
        } else {
            return new Sedan(color, weight, doorCount);
        }
    }
}

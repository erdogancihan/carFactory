package Test;

import carfactory.Car;
import carfactory.CarFactory;
import carfactory.CarModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class CarFactoryTest {

    // I created five instance of FireTruck Objects.
    Car fireTruck1 = CarFactory.getInstance(CarModel.FIRETRUCK, "Blue", 10000, (byte) 4, 1000D);
    Car fireTruck2 = CarFactory.getInstance(CarModel.FIRETRUCK, "Red", 11000, (byte) 5, 2000D);
    Car fireTruck3 = CarFactory.getInstance(CarModel.FIRETRUCK, "Blue", 12000, (byte) 3, 3000D);
    Car fireTruck4 = CarFactory.getInstance(CarModel.FIRETRUCK, "Red", 13000, (byte) 2, 4000D);
    Car fireTruck5 = CarFactory.getInstance(CarModel.FIRETRUCK, "Blue", 14000, (byte) 6, 5000D);

    /*
    Verify if  the color of the FireTruck is Blue
    */
    @Test
    public void fireTruckColorBlue() {
        assertEquals("Blue", fireTruck1.getColor());
    }

    /*
    Check if the door number of the Sedan is 5.
    */
    @Test
    public void sedanDoorNumberFive() {
        Car sedan = CarFactory.getInstance(CarModel.SEDAN, "Blue", 15000, (byte) 5);
        assertEquals(5, sedan.getDoorCount());
    }

    /*
    Check if fireTruck signal  is different from the other cars.
    */
    @Test
    public void fireTruckSignal() {
        assertEquals("Firetruck makes special signal:)", fireTruck2.signal());
    }

    /*
      Check if Suv signal functions.
    */
    @Test
    public void SUVSignal() {
        Car sedan = CarFactory.getInstance(CarModel.SEDAN, "Blue", 15000, (byte) 5);
        assertEquals("The car signals.", sedan.signal());
    }

    /*
    Check if fireTruck can put out the fire.
    */
    @Test
    public void fireTruckPutOutFire() {
        assertTrue(fireTruck3.putOutFire());
    }

    /*
     Check if fireTruck can drive.
    */
    @Test
    public void fireTruckDrives() {
        assertEquals("The car drives.", fireTruck5.drive());
    }

    /*
     Check if craneTruck can drive.
    */
    @Test
    public void CraneTruckdrives() {
        Car craneTruck= CarFactory.getInstance(CarModel.CRANETRUCK, "Blue", 15000, (byte) 5);
        assertEquals("The car drives.", craneTruck.drive());

    }

}

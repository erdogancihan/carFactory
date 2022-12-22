package carfactory;

//Car class implements the ICar interface
public class Car implements ICar {


    private String color;
    private int weight;
    private byte doorCount;



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public byte getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(byte doorCount) {
        this.doorCount = doorCount;
    }

    //All Arguments Constructor
    public Car(String color, int weight, byte doorCount) {
        this.color = color;
        this.weight = weight;
        this.doorCount = doorCount;
    }

    // This is the implementation of the drive method.
    @Override
    public String drive() {
        return "The car drives.";
    }

    // This is the implementation of the signal method.
    @Override
    public String signal() {
        return "The car signals.";
    }

    /*This is the implementation of the putOutFire method.
     Only the Fire truck has the capability to put out a fire.
     All other Car types return the value "false".
*/
    @Override
    public boolean putOutFire() {
        return false;
    }


}



public class CarClient {
    public static void main(String[] args) {
        String userChoice = "BMW";
        System.out.println("Selected Car: " + userChoice);
        car carInstance = new ElectricVehicle();
        car carname = carInstance.getcar();
        carname.displayComponents();
        carInstance.WheelType("Pressed Steel Disc Wheel");
        carInstance.Colour("Black");
    }

}

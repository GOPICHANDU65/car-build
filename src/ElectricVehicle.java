import Model.Ac;
import Model.Control;
import Model.Engine;

public class ElectricVehicle extends car{

    private Engine engine;
    private Ac ac;
    private Control control;

    ElectricVehicle(Engine engine, Ac ac, Control control) {
        this.engine = engine;
        this.ac = ac;
        this.control = control;
    }

    public ElectricVehicle () {


    }

    @Override
    void WheelType(String Wheel) {
        System.out.println("Wheel Type: " + Wheel);
    }

    @Override
    void Colour(String color) {
        System.out.println("Color: " + color);
    }


    void displayComponents() {
        System.out.println("Engine: " + engine);
        System.out.println("Ac: " +ac);
        System.out.println("control: "+ control);
    }
}
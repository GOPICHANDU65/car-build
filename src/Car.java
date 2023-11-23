import Model.Ac;
import Model.Control;
import Model.Engine;

 abstract class car {

    abstract void WheelType(String Wheel);
    abstract void Colour(String color);
    String engine;
    String ac;
    String control;

    public car getcar() {
        Engine engine = getEngine();
        Ac ac = getAc();
        Control control = getControl();
        return new ElectricVehicle(engine,ac,control);

    }


    public Engine getEngine() {
        return new Engine(220, 12.65);
    }

    public Ac getAc() {
        return new Ac(1.5, "LG");
    }

    public Control getControl() {
        return new Control("disc brakes", 5);
    }

    void displayComponents() {
        System.out.println("Engine: " + engine);
        System.out.println("AC: " + ac);
        System.out.println("Control: " + control);
    }

}
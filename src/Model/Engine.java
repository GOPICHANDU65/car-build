package Model;

public class Engine {
    private int horsepower;
    private double displacement;

    public Engine(int horsepower, double displacement) {
        this.horsepower = horsepower;
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return  horsepower + " horsepower," + displacement + "version";
    }

}

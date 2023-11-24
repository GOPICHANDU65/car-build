

public class CarClient {
    public static void main(String[] args) {
        String userChoice = "BMW";
        System.out.println("Selected Car: " + userChoice);
        car cars = new FamilyCars();
        System.out.println("Engine:"+cars.getEngine());
        System.out.println("Ac:"+cars.getAc());
        System.out.println("Control:"+cars.getControl());
        cars.getcar();

    }

}

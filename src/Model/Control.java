package Model;

public class Control {
    private String brakeType;
    private int gares;

    public Control(String brakeType, int gares) {
        this.brakeType = brakeType;
        this.gares = gares;
    }

    @Override
    public String toString() {
        return  brakeType +","+gares+" gares";
    }




}

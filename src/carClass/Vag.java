package carClass;

public abstract class Vag {

    public String brand;
    public String model;
    private int defective;


    public void sayIamSold() {
        System.out.println("I am sold!");
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {return brand; }

    public int getDefective() { return defective; }
}
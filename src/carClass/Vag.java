package carClass;

public abstract class Vag {

    public String brand;
    public String model;
    private int defective;


    public void sayIamSold() {
        System.out.println("I am sold!");
    }

    public String getBrand() { return brand; }
    public String getModel() { return model;}
}
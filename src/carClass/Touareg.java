package carClass;

final public class Touareg extends  Volkswagen{

    public String engine;
    public double cost;
    public String equipment;
    public void sayIamSold() {
        System.out.println("Sold out....");
    }
    public void sayImMan(){
        System.out.println("I am the car of the son of my mother's friend");
    }
    public String getEngine() {return engine;}
}

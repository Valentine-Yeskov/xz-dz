package carClass;

public abstract class Volkswagen extends Vag{

    public String collar;
    public int price;

    public void sayIamSold() {
        System.out.println("Sold out. I waiting for new cars!");
    }

    public String getCollar() { return collar; }

    public int getPrice() { return price; }

}

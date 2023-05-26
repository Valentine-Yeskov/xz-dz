package dogsClass;
import interfacesClass.Power;
import interfacesClass.Volume;

final public class Puppy3 extends Dog implements Volume {
    public int birthDay;  //year
    public String master;
    public void saySomething() {
        System.out.println("Grrrrrrrr");
    }
    public void sayGaf() {
        System.out.println("Grrrrrrrr, Grrrrrrrr");
    }
    @Override
    public void on(){
        System.out.println("On");
    }

    @Override
    public void off() {
        System.out.println("Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }
}

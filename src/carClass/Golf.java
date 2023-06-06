package carClass;

import interfacesClass.Move;

final public class Golf extends Volkswagen implements Move {

    public String gender;
    public int age;
    public int yourWeight;

    public void sayIamSold() {
        System.out.println("I have a car for you");
    }
    public void SayIamGay(){
        System.out.println("I am Golf and i am the best car in the wold!");
    }

    @Override
    public void down() {
        System.out.println("Move Down");
    }

    @Override
    public void up() {
        System.out.println("Move Up");
    }

    @Override
    public void left() {
        System.out.println("Turn Right");
    }

    @Override
    public void right() {
        System.out.println("Turn Right");
    }
}

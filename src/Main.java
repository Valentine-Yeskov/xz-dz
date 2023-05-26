import dogsClass.Animal;
import dogsClass.Dog;
import dogsClass.Puppy1;
import dogsClass.Puppy2;
import dogsClass.Puppy3;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void saySomething() {
                super.saySomething();
            }
        };

        Puppy3 puppy3 = new Puppy3();
        puppy3.sayGaf();
        Puppy2 puppy2 = new Puppy2();
        puppy2.sayGaf();
        Puppy1 puppy1 = new Puppy1();
        puppy1.sayGaf();

        Dog dog = new Puppy1();
        dog.saySomething();

        dog = new Puppy2();
        dog.saySomething();

        dog = new Puppy3();
        dog.saySomething();


    }

}
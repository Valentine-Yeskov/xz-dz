import dogsClass.Animal;
import dogsClass.Dog;
import dogsClass.Puppy1;
import dogsClass.Puppy2;
import dogsClass.Puppy3;

import carClass.Vag;
import carClass.Volkswagen;
import carClass.Passat;
import carClass.Touareg;
import carClass.Golf;

public class Main {
    public static void main(String[] args) {

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

        Golf golf = new Golf();
        golf.SayIamGay();
        Passat passat = new Passat();
        passat.sayBestCarForOldPeople();
        Touareg touareg = new Touareg();
        touareg.sayImMan();

        Volkswagen volkswagen = new Golf();
        volkswagen.sayIamSold();
        volkswagen = new Passat();
        volkswagen.sayIamSold();
        volkswagen = new Touareg();
        volkswagen.sayIamSold();
    }

}
package dogsClass;

import interfacesClass.Other;

final public class Puppy2 extends Dog implements Other {
    public String nickname;
    public int length;

    public void saySomething() {
        System.out.println("Raf Raf");
    }

    public void sayGaf() {
        System.out.println("Raf, Raf");
    }

    @Override
    public void menu() {
        System.out.println("Action Menu");
    }

    @Override
    public void exit() {
        System.out.println("Action  Exit");
    }
}
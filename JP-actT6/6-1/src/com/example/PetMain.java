package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        Animal ca;
        Animal fi;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();

        Pet p;
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        ca = new Cat();
        ca.eat();
        ca.walk();
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        fi = new Fish();
        fi.eat();
        fi.walk();

        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);
    }
    
    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet)a;
            p.play();
        } else {
            System.out.println("Danger! Wild Animal");
        }
    }
    
}
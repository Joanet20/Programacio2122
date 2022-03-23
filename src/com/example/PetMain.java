package com.example;

public class PetMain {

    public static void main(String[] args) {
        Animal a;
        Pet p;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        //test a spider with an animal reference
        a = new Spider();
        a.eat();
        a.walk();


        System.out.println();
        System.out.println();

        //test a spider with a spider reference
        Cat c = new Cat();
        c.eat();
        c.walk();
        //test a spider with an animal reference
        a = new Cat();
        a.eat();
        a.walk();

        p = new Cat();
        p.setName("Lago");
        p.play();

        System.out.println();
        System.out.println();


        //test a spider with a spider reference
        Fish f = new Fish();
        f.eat();
        f.walk();
        //test a spider with an animal reference
        a = new Fish();
        a.eat();
        a.walk();

        p = new Fish();
        p.setName("Nemo");
        p.play();


        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);

    }
    
    public static void playWithAnimal(Animal a) {
        // completed in practice
        if (a instanceof Pet){
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Danger!! Wild animal!!");
        }
    }
    
}
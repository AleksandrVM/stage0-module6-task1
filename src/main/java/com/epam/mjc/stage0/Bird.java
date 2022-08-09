package com.epam.mjc.stage0;

public class Bird extends Animal{

    public Bird(){
        super("blue", 2, false);
    }
    public String getDescription(){
        return super.getDescription() + " Moreover, it has 2 wings and can fly.";
    }

    public static void main(String[] arvs){
        Animal animal = new Animal("black", 4, true);
        System.out.println(animal.getDescription());
        Animal bird = new Bird();
        System.out.println(bird.getDescription());
        Animal dog = new Dog();
        System.out.println(dog.getDescription());
    }
}

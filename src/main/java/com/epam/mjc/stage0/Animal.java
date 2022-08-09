package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String description = "This animal is mostly " + color +
                ". It has " + numberOfPaws + (numberOfPaws == 1 ? " paw" : " paws") + " and "
                + (hasFur == true ? "a" : "no") + " fur.";
        return description;
    }

    public static void main(String[] args){
        System.out.println(new Animal("black", 1, false).getDescription());
    }

}

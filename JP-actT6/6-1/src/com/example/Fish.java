package com.example;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("Just keep swimming.");
    }

    public void eat() {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
}

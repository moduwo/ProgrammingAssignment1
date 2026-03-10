package edu.uno.csci2830;

public class Fruit extends Health{
    public Fruit() {
        super(60);
    }

    @Override public String toString() {return "Fruit: 60 calories";}
}
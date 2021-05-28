package com.company;

public class Square extends Shape{
    private double strana;
    public Square(double s) {
        strana = s;
    }
    public double velikost() {
        return strana;
    }

    @Override
    public double obvod() {
        return 4 * strana;
    }

    @Override
    public double obsah() {
        return strana * strana;
    }
}

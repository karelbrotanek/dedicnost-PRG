package com.company;

public class Circle extends Shape {
    private double polomer;
    public Circle(double p){
        polomer = p;
    }

    public double getPolomer() {
        return polomer;
    }
    public double getPrumer() {
        return 2 * polomer;
    }
    public double obsah() {
        return Math.PI * polomer * polomer;
    }

    @Override
    public double obvod() {
        return Math.PI * 2 * polomer;
    }
}

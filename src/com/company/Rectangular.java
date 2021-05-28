package com.company;

public class Rectangular extends Shape{
    private double stranaA;
    private double stranaB;
    public Rectangular(double a, double b){
        stranaA = a;
        stranaB = b;
    }
    public double delka() {
        if (stranaA > stranaB){
            return stranaA;
        }
        return stranaB;
    }
    public double vyska() {
        if (stranaA < stranaB){
            return stranaA;
        }
        return stranaB;
    }

    @Override
    public double obvod() {
        return 2 * stranaA + 2 * stranaB;
    }

    @Override
    public double obsah() {
        return stranaA * stranaB;
    }
}

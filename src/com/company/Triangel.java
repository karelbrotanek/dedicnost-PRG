package com.company;

public class Triangel extends Shape {
    private double stranaA;
    private double stranaB;
    private double stranaC;
    public Triangel(double A, double B, double C){
        stranaA = A;
        stranaB = B;
        stranaC = C;
    }

    public double getStranaA() {
        return stranaA;
    }

    public double getStranaB() {
        return stranaB;
    }

    public double getStranaC() {
        return stranaC;
    }

    @Override
    public double obsah() {
        double s = (stranaA + stranaB + stranaC)/2;
        return Math.sqrt(s * (s - stranaA) * (s - stranaB) * (s - stranaC));
    }

    @Override
    public double obvod() {
        return stranaA  + stranaB + stranaC;
    }
    public double vyska() {
        return this.obsah() * 2 / stranaC;
    }
}

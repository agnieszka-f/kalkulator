package com.kodilla;

public class Calculator {

    public static void main(String[] args){
        Calculator calc1  =new Calculator(8,2.5);
        System.out.println(calc1.addAB());
        System.out.println(calc1.minusAB());
    }
    double a;
    double b;

    public Calculator(double a, double b){
        this.a=a;
        this.b=b;
    }
    public double addAB(){
        return a+b;
    }
    public double minusAB(){
        return a-b;
    }
}

package com.dxc.javaproject.interfaceex;

import java.io.IOException;

interface CalcInterface {
    void multiply();
    void divide();
}
public class InterExample implements CalcInterface {
    int a = 10;
    int b = 20;
    int c;
    public void multiply() {
        int c = a * b;
        System.out.println("Multiplication of numbers is: " + c);
    }
    public void divide() {
        int c = a / b;
        System.out.println("Division of numbers is: " + c);
    }
    public static void main (String[] args) throws IOException {
        InterExample obj = new InterExample();
        obj.multiply();
        obj.divide();
    }
}

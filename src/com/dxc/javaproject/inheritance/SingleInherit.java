package com.dxc.javaproject.inheritance;

class Shape {
    public void display() {
        System.out.println("Inside display");
    }
}
class Rectangle extends Shape {
    public void area() {
        System.out.println("Inside area");
    }
}
public class SingleInherit {
    public static void main(String[] arguments) {
        Rectangle rect = new Rectangle();
        rect.display();
        rect.area();
    }
}

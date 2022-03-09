package com.dxc.javaproject.collections;

public class EnumDemo {
    //defining enum within class
    public enum Season {WINTER, SPRING, SUMMER, FALL, MONSOON}

    //creating the main method
    public static void main(String[] args) {
        //printing all enum
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
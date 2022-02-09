package com.dxc.javaproject.polymorphism;

public class RunBike {
        void run()
        {
            System.out.println("running");
        }
}
class Splendor extends RunBike{
        void run()
        {
            System.out.println("running safely with 60km");
        }
        public static void main(String args[])
        {
            RunBike b = new Splendor();
            b.run();
        }
}

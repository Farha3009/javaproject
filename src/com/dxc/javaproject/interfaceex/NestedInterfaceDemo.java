package com.dxc.javaproject.interfaceex;

class Trees {
    interface Activity {
        void color();
    }
}
class Palm implements Trees.Activity {
    public void color() {
        System.out.println("Trees are green and tall.");
    }
}
public class NestedInterfaceDemo {
    public static void main(String args[]) {
        Palm palm= new Palm();
        palm.color();
    }
}
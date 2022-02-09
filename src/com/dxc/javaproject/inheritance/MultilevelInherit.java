package com.dxc.javaproject.inheritance;

class Tree{
    void height()
    {
        System.out.println("tall...");
    }
}
class DatePalm extends Trees {
    void product()
    {
        System.out.println("dates...");
    }
}
class Leaves extends DatePalm{
    void size()
    {
        System.out.println("long...");
    }
}
public class MultilevelInherit {
    public static void main(String args[])
    {
        Leaves d = new Leaves();
        d.height();
        d.product();
        d.size();
    }
}
package com.dxc.javaproject.inheritance;

class Trees{
    void height()
    {
        System.out.println("tall...");
    }
}
class Palm extends Trees {
    void product()
    {
        System.out.println("oil...");
    }
}
class Pear extends Trees{
    void product()
    {
        System.out.println("pear...");
    }
}
public class HierarchicalInherit {
    public static void main(String args[])
    {
        Pear p = new Pear();
        p.height();
        p.product();
    }
}

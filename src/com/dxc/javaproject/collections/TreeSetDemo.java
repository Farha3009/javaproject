package com.dxc.javaproject.collections;

import java.util.*;
public class TreeSetDemo {
    public static void main(String args[]) {
        // TreeSet declaration
        TreeSet<String> tset = new TreeSet<String>();

        // Adding elements to the TreeSet
        tset.add("Apple");
        tset.add("Mango");
        tset.add("Grapes");
        tset.add("Orange");
        tset.add("Fig");
        //Addition of duplicate elements
        tset.add("Apple");
        tset.add("Mango");

        tset.remove("Fig");
        //Displaying HashSet elements
        System.out.println(tset);
    }
}

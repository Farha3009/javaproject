package com.dxc.javaproject.collections;

import java.util.*;
public class LinkedHashSetDemo {
    public static void main(String args[]) {
        // LinkedHashSet declaration
        LinkedHashSet<String> lhset = new LinkedHashSet<String>();
        // Adding elements to the LinkedHashSet
        lhset.add("Apple");
        lhset.add("Mango");
        lhset.add("Grapes");
        lhset.add("Orange");
        lhset.add("Fig");
        //Addition of duplicate elements
        lhset.add("Apple");
        lhset.add("Mango");
        //Addition of null values
        lhset.add(null);

        lhset.remove("Fig");
        //Displaying LinkedHashSet elements
        System.out.println(lhset);
    }
}
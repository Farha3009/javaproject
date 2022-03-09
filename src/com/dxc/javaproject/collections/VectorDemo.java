package com.dxc.javaproject.collections;

import java.util.Vector;
class vectorDemo {
    public static void main(String[] args){
        Vector<String> rivers = new Vector<>();

        rivers.add("Indus");
        rivers.add("Ganges");

        rivers.add(2, "Yamuna");
        System.out.println("Vector: " + rivers);

        Vector<String> oceans = new Vector<>();
        rivers.add("Krishna");

        oceans.addAll(rivers);
        System.out.println("New Vector: " + rivers);

    }
}
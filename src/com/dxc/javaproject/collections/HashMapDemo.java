package com.dxc.javaproject.collections;

import java.util.*;
public class HashMapDemo{
    //access modifier//keyword//return type//main function calling//string array argument
    public static void main(String args[]){
        //classname//data types//object//keyword//constructor
        //Creating HashMap
        HashMap<Integer,String> Rivers=new HashMap<Integer,String>();
        //Put elements in Map
        Rivers.put(1,"Krishna");
        Rivers.put(2,"Kaveri");
        Rivers.put(3,"Indus");
        Rivers.put(4,"Yamuna");
        //its a printing statement

        for(Map.Entry m : Rivers.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}

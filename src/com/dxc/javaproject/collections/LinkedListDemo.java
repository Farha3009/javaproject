package com.dxc.javaproject.collections;

import java.util.LinkedList;
class LinkedListDemo {
 public static void main(String[] args){
  LinkedList<String> rivers = new LinkedList<>();

  rivers.add("Indus");
  rivers.add("Ganges");
  rivers.add("Kaveri");
  rivers.add("Krishna");

  System.out.println("LinkedList: " + rivers);
 }
}

package com.dxc.javaproject.collections;

import java.util.*;
public class ArrayDequeDemo {
    public static void main(String[] args) {

        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gani");
        deque.add("Farha");
        deque.add("Syra");

        for (String str : deque) {
            System.out.println(str);
        }
    }
}
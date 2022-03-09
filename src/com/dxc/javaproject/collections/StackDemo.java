package com.dxc.javaproject.collections;

import java.util.Stack;
public class StackDemo {
    public static void main(String[] args)
    {
        Stack<String> stk= new Stack<>();
        stk.push("Krishna");
        stk.push("Kaveri");
        stk.push("Godavari");
        stk.push("Indus");
        System.out.println("Stack: " + stk);

        stk.pop();
        String rivers = stk.peek();

        System.out.println("Element at top: " + rivers);
    }
}
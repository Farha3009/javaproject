package com.dxc.javaproject.array;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.Collections;

import java.util.List;

public class ReverseEx {

    public static void main(String args[])  {

        String[] arrayColor = {"Red", "Green", "Blue", "Orange","Yellow"};

        System.out.println("Array Before: " + Arrays.toString(arrayColor) );

        List<String> arrayNewColor = Arrays.asList(arrayColor);

        Collections.reverse(arrayNewColor);

        String[] reversed = arrayNewColor.toArray(arrayColor);

        System.out.println("Array Reverse: " + Arrays.toString(reversed) );

    }

}

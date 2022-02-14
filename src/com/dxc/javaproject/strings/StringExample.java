package com.dxc.javaproject.strings;

import java.io.*;
import java.util.*;
class StringExample
{
    public static void main (String[] args)
    {
        String s= "MyLife";
        System.out.println("String length = " + s.length());
        System.out.println("Character at 3rd position = "
                + s.charAt(3));

        System.out.println("Substring " + s.substring(3));

        System.out.println("Substring  = " + s.substring(2,5));


        String s1 = "My";
        String s2 = "Life";
        System.out.println("Concatenated string  = " +
                s1.concat(s2));


        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " +
                s4.indexOf("Share"));


        System.out.println("Index of a  = " +
                s4.indexOf('a',3));


        Boolean out = "My".equals("life");
        System.out.println("Checking Equality  " + out);
        out = "My".equals("Life");
        System.out.println("Checking Equality  " + out);

        out = "My".equalsIgnoreCase("LiFE ");
        System.out.println("Checking Equality " + out);


        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);

        String word1 = "Life";
        System.out.println("Changing to lower Case " +
                word1.toLowerCase());


        String word2 = "Life";
        System.out.println("Changing to UPPER Case " +
                word2.toUpperCase());


        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());


        String str1 = "nylife";
        System.out.println("Original String " + str1);
        String str2 = "nylife".replace('n' ,'m') ;
        System.out.println("Replaced n with m -> " + str2);
    }
}
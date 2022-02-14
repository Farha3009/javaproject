package com.dxc.javaproject.decision;

public class Switch {
    public static void main(String[] args) {
        int day=5;
        String dayString="";
        switch(day){
            case 1: dayString="1 - Monday";
                break;
            case 2: dayString="2 - Tuesday";
                break;
            case 3: dayString="3 - Wednesday";
                break;
            case 4: dayString="4 - Thursday";
                break;
            case 5: dayString="5 - Friday";
                break;
            case 6: dayString="6 - Saturday";
                break;
            case 7: dayString="7 - Sunday";
                break;
            default:System.out.println("Invalid !");
        }
        System.out.println(dayString);
    }
}
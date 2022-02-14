package com.dxc.javaproject.strings;

public class BufferExample {
        public static void main(String args[]){
            StringBuffer sb=new StringBuffer("Hello ");
            sb.append("World");
            sb.insert(1,"world");
            sb.replace(1,3,"world");
            sb.delete(1,2);
            sb.reverse();
            System.out.println(sb);

        }
}

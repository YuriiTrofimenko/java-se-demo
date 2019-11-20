/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.stringsdemo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class StringsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char ch1 = '7';
        // String s1 = "777";
        // String s2 = new String("555");
        
        /* String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); */
        
        // String s1 = "Hello"; // new String("Hello");
        // String s2 = "Hello"; // s1
        
        /* Scanner sc = new Scanner(System.in);
        System.out.println("s1 = ");
        String s1 = sc.nextLine();
        System.out.println("s2 = ");
        String s2 = sc.nextLine();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2)); */
        
        /* String s1 = "777";
        s1 = s1.replace("7", "5");
        System.out.println(s1); */
        
        //String s1 = "777"; // 775
        // System.out.println(s1.length() - 1);
        // System.out.println(s1.substring(s1.length() - 1));
        //System.out.println(s1.substring(0, s1.length() - 1) + "5");
        
        StringBuilder sb1 = new StringBuilder("Hello");
        String str1 = "Hello";
        /* int x = 0;
        x = x + 1;
        x += 1;
        x++; */
        
        // String demo (-460256)
        /* long m1 = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 100; i++) {
            str1 += i;
        }
        System.out.println(str1);
        System.out.println(Runtime.getRuntime().freeMemory() - m1); */
        
        // StringBuilder demo (0)
        /* long m1 = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 100; i++) {
            sb1.append(i);
        }
        System.out.println(sb1.toString());
        System.out.println(Runtime.getRuntime().freeMemory() - m1); */
        
        // String demo (-460256)
        long m1 = Runtime.getRuntime().freeMemory();
        for (int i = 0; i < 100000; i++) {
            str1 += i;
        }
        System.out.println(str1);
        System.out.println(Runtime.getRuntime().freeMemory() - m1);
    }
}

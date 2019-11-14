/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.algorithms;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // boolean x = (2 * 2 == 5);
        /* if (x) {
            System.out.println("TRUE!");
        } */
        
        /* boolean x = (2 * 2 == 4);
        if (x) {
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!");
        } */
        
        Scanner sc = new Scanner(System.in);
        /*int x = sc.nextInt();
        if (x == 0) {
            System.out.println("ZERO");
        } else if (x == 1) {
            System.out.println("ONE");
        } else {
            System.out.println("Smth. else");
        }*/
        while(true){
            int x = sc.nextInt();
            if (x == 0) {
                System.out.println("ZERO");
            } else if (x == 1) {
                System.out.println("ONE");
            } else if (x == -1) {
                break;
            } else {
                System.out.println("Smth. else");
            }
        }
    }
    
}

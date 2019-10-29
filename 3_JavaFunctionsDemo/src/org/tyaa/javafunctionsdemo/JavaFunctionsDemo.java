/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javafunctionsdemo;

/**
 *
 * @author student
 */
public class JavaFunctionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printHello();
        printHello();
        printInteger(12);
        // Объявление и одновременно - инициализация
        int resource = 43;
        printInteger(resource);
        printSum(resource, resource);
        // Объявление переменной с именем result и типом int
        int result;
        // Первое присвоение переменной значения - инициализация
        result = calcSum(2, 3);
        // Присвоение переменной нового значения
        result = calcSum(3, 3);
        System.out.println(calcSum(2, 3));
        System.out.println(result);
      
        int sqr = calcSqr(3);
        System.out.println(sqr);
        System.out.println(calcSqr(result));
    }
    
    public static void printHello(){
        System.out.println("Hello");
    }
    
    public static void printInteger(int _integer){
        System.out.println(_integer);
    }
    
    public static void printSum(int _x, int _y){
        System.out.println(_x + _y);
    }
    
    public static int calcSum(int _x, int _y){
        return _x + _y;
    }
    
   public static int calcSqr(int _x){
        return _x * _x;
    }  
   
}

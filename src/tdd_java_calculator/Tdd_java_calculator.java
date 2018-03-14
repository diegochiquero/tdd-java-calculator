/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd_java_calculator;

/**
 *
 * @author diego
 */
public class Tdd_java_calculator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        int operationSum;
        operationSum = sum(12, 4);
        System.out.println("Result of sum: " + operationSum);
        
        int operationSubstract;
        operationSubstract = substract(12, 4);
        System.out.println("Result of subtraction: " + operationSubstract);
        
        int operationProduct;
        operationProduct = product(12, 4);
        System.out.println("Result of product: " + operationProduct);
        
        int operationDivide;
        operationDivide = divide(12, 4);
        System.out.println("Result of divide: " + operationDivide);
    }
    
    public static int sum(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("Error type: " + e.getMessage());
        }
        return 0;
    }
    
    public static int substract(int a, int b) {
        try {
            return a - b;
        } catch (Exception e) {
            System.out.println("Error type: " + e.getMessage());
        }
        return 0;
    }
    
    public static int product(int a, int b) {
        try {
            return a * b;
        } catch (Exception e) {
            System.out.println("Error type: " + e.getMessage());
        }
        return 0;
    }
    
    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Error type: " + e.getMessage());
        }
        return 0;
    } 
}

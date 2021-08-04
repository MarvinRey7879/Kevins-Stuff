package com.company;

public class Fibonacci {

    static void FibonacciZahl(int n) {
        int fibonacci_zahl1 = 1;
        int fibonacci_zahl2 = 1;
        int fibonacci_Zahl = 0;
        if( n == 0 ){
            System.out.println(n);
        }else {
            for (int i = 0; i < n; i++) {
                if(i == 0 ){
                    System.out.println(1);
                }else if (i == 1) {
                    System.out.println(1);
                }else{
                    fibonacci_Zahl = fibonacci_zahl1 + fibonacci_zahl2;
                    fibonacci_zahl1 = fibonacci_zahl2;
                    fibonacci_zahl2 = fibonacci_Zahl;
                    System.out.println(fibonacci_Zahl);
                }
            }

        }
    }
    public static void main(String[] args) {
            FibonacciZahl(9);

        }
    }


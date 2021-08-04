package com.company;

public class Schleifen_und_Modulo {
    public static void main(String[] args){
        for(int i = 0; i < 100 ; i++){
            if(i % 3 == 0){
                System.out.println("foo");
            }else if(i % 5 == 0){
                System.out.println("bar");
            }else{
                System.out.println(i);
            }
        }
    }
}

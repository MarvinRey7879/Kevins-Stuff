package com.company;
import javax.net.ssl.SNIHostName;
import java.util.ArrayList;
import java.util.Scanner;

public class LineareFunktionen {


    public static void main(String[] args) {
        ArrayList<Integer> funktionsWerte = new ArrayList();
        int Fläche = 0;

        //Eingabe erfassen von n
        Scanner input = new Scanner(System.in);
        System.out.println("Gib eine y-Koordinate ein");
        String userinput = input.nextLine();

        int n = Integer.parseInt(userinput);

        int AnzahlFunktionenGleichNull = 0;
        for(int i = 0 ; i<20 ;i++){
           int funktionswert = 2 * i + n;
           Fläche += funktionswert;

           funktionsWerte.add(funktionswert);
           if(funktionswert > 0){
               AnzahlFunktionenGleichNull++;
           }


        }
        System.out.println("Die Fläche beträgt:" + Fläche);


    }
}

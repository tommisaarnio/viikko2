package main;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main( String[] args ) {
        InputStreamReader defaultInputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(defaultInputReader);
        Scanner sc = new Scanner(bufferedReader);
        boolean exit = false;
        Hedgehog hedgehog = new Hedgehog();
        while (!exit) {
            System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );
            int i = Integer.parseInt(sc.nextLine());
            switch(i) {
                case 1:
                    System.out.println("Mitä siili sanoo:");
                    String talk = sc.nextLine();
                    hedgehog.speak(talk);
                    break;
                case 2:
                    System.out.println("Anna siilin nimi: ");
                    String name = sc.nextLine();
                    System.out.println("Anna siilin ikä: ");
                    int age = Integer.parseInt(sc.nextLine());
                    Hedgehog newHedgehog = new Hedgehog(name, age);
                    hedgehog = newHedgehog;
                    break;
                case 3:
                    System.out.println("Kuinka monta kierrosta?");
                    int rounds = Integer.parseInt(sc.nextLine());
                    int number = 0;
                    while (number < rounds) {
                        hedgehog.run();
                        number++;
                    }
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    sc.close();
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");                        
                    break;
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kufuda;

import java.util.Scanner;

/**
 *
 * @author Xplore
 */
public class Kufuda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Silahkan masukan angka menu fungsi dasar ");
        System.out.println("1. Fungsi FAKTORIAL");
        System.out.println("2. Fungsi FIBONACCI");

        Scanner input = new Scanner(System.in);

        int angkamenu = input.nextInt();

        switch (angkamenu) {

            case 1:
                System.out.println("Masukan nilai faktorial yang akan dihitung:");
                int inputfak = input.nextInt();

                int outputfak = faktorial(inputfak);

                System.out.println("Nilai dari " + inputfak + " adalah " + outputfak);

                break;
            case 2:
                System.out.println("Masukan deret FIBONACCI yang akan dihitung:");
                int inputfibo = input.nextInt();
                System.out.println("Deret fibonacci dari " + inputfibo + " adalah ");
                for (int i = 0; i < inputfibo; i++) {
                    int resultfibo = fibonacci(i);
                    System.out.print(resultfibo + ", ");
                }
                break;
            default:
                System.out.println("Menu tidak tersedia");
                break;
        }

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int faktorial(int n) {
        int i, fact = 1;
        int number;//It is the number to calculate factorial    
        number = n;//It is the number to calculate factorial    
        ;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        return fact;

    }

}

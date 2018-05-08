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
        System.out.println("3. Fungsi BILANGAN PRIMA KE-N");
        System.out.println("4. Fungsi PENENTU GANJIL GENAP");
        System.out.println("5. Fungsi SEGITIGA BINTANG");
        System.out.println("6. Fungsi SISA BAGI");

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

            case 3:

                System.out.println("Masukan N:");
                int n = input.nextInt();
                System.out.println("Bilangan prima ke-" + n + " adalah ");
                if (n == 1) {
                    System.out.println("2");
                }
                for (int i = 1, j = 3;; j += 2) {
                    if (prima(j)) {
                        i++;
                    }
                    if (i == n) {
                        System.out.println(j);
                        break;
                    }
                }
                break;
            case 4:
                System.out.println("Masukan N:");
                int prima;
                prima = input.nextInt();
                if (prima % 2 == 0) {
                    System.out.println(prima + " adalah bilangan genap");
                } else {
                    System.out.println(prima + " adalah bilangan ganjil");
                }
                break;
            case 5:
                 System.out.println("Masukan jumlah bintang yang diinginkan dari 1 sampai 100:");
                int inputbintang = input.nextInt();
                if (inputbintang<=0||inputbintang>100){
                    System.out.println("Angka yang anda masukkan tidak sesuai dengan ketentuan");
                }
                else{
                bintang(inputbintang);
                }
                break;
            case 6:
                System.out.println("Masukan angka pertama (1-100):");
                int inputangka = input.nextInt();
                System.out.println("Masukan pembagi(1-100):");
                int inputpembagi = input.nextInt();
                if (inputangka<=0||inputangka>100){
                    System.out.println("Angka yang anda masukkan tidak sesuai dengan ketentuan");
                }
                if (inputpembagi<=0||inputpembagi>100){
                    System.out.println("Pembagi yang anda masukkan tidak sesuai dengan ketentuan");
                }
                else{
                bagi(inputangka, inputpembagi);
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

    public static boolean prima(int n) {

        if (n <= 1) {
            return false;
        }

        if (n == 2) {
            return true;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void bintang(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void bagi(int a, int b) {
        int angka = a;
        int pembagi = b;
        int hasilPembagi = angka / pembagi;    // Operator (/) menampilkan hasil bagi dari 10:3=3
        int hasilSisa = angka % pembagi;    // Operator (%) menampilkan sisa bagi yaitu sisa 1
        // menampilkan output
        System.out.println("");
        System.out.println("OUTPUT HASIL dari PEMBAGI :");
        System.out.println(angka + " : " + pembagi + " = " + hasilPembagi);
        System.out.println("OUTPUT dari SISA PEMBAGI :");
        System.out.println(+angka + " : " + pembagi + " = " + hasilSisa);
    }

}

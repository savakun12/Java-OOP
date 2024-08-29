/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ahlil
 */
public class Mavenproject1 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String response;

        do {
            System.out.print("Masukkan angka: ");
            int number = scanner.nextInt();
            sum += number;
            count++;

            System.out.print("Apakah Anda ingin memasukkan angka lagi? (ya/tidak): ");
            response = scanner.next();
        } while (response.equalsIgnoreCase("ya"));

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Jumlah angka yang dimasukkan: " + sum);
            System.out.println("Berapa kali angka dimasukkan: " + count);
            System.out.println("Rata-rata angka yang dimasukkan: " + average);
        } else {
            System.out.println("Tidak ada angka yang dimasukkan.");
        }

        scanner.close();
    }
}

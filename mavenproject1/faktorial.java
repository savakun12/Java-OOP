/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author ahlil
 */
public class faktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int angka = scanner.nextInt();
        long faktorial = 1; // Menggunakan long untuk mendukung angka yang lebih besar

        for (int i = 1; i <= angka; i++) {
            faktorial *= i;
        }

        System.out.println("Faktorial dari " + angka + " adalah: " + faktorial);

        scanner.close();
    }
}

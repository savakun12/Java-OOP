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
public class parkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam parkir: ");
        int jam = scanner.nextInt();
        int biaya = 8000; // Biaya untuk satu jam pertama

        if (jam > 1) {
            biaya += (jam - 1) * 3000; // Tambahan biaya untuk setiap jam lebih dari satu jam pertama
        }

        System.out.println("Total biaya parkir: Rp " + biaya);

        scanner.close();
    }
    
}

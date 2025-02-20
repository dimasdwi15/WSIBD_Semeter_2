/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara_11_12;

import java.util.Random;
import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah deret dari pengguna
        System.out.print("Masukkan jumlah deret array: ");
        int jumlahDeret = scanner.nextInt();

        // Membuat objek Random untuk menghasilkan angka acak
        Random random = new Random();

        // Membuat array untuk menyimpan angka acak
        int[] randomArray = new int[jumlahDeret];

        // Mengisi array dengan angka acak antara 1 sampai 100
        for (int i = 0; i < jumlahDeret; i++) {
                randomArray[i] = random.nextInt(100) + 1;  // Angka acak antara 1 dan 100
        }

        // Menampilkan array yang dihasilkan
        System.out.print("Array acak yang di3hasilkan: [");
        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

        


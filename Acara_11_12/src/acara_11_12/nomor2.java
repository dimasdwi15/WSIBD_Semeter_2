/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acara_11_12;

import java.util.Random;
import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Masukkan jumlah deret array: ");
        int jumlahDeret = scanner.nextInt();

       
        Random random = new Random();

        int[] randomArray = new int[jumlahDeret];
   
        for (int i = 0; i < jumlahDeret; i++) {
                randomArray[i] = random.nextInt(100) + 1;  
        }

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

        


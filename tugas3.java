package belajar;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] items = {"Beras", "Gula", "Minyak", "Telur", "Susu"};
        double[] prices = {100000, 15000, 20000, 25000, 30000};
        int[] quantities = new int[5];
        
        for (int i = 0; i < items.length; i++) {
            while (true) {
                System.out.print("Masukkan jumlah " + items[i] + " yang ingin dibeli: ");
                quantities[i] = scanner.nextInt();
                if (quantities[i] >= 0) {
                    break;
                } else {
                    System.out.println("Jumlah tidak valid. Silakan masukkan jumlah yang valid.");
                }
            }
        }

        double totalPrice = 0;
        for (int i = 0; i < items.length; i++) {
            totalPrice += prices[i] * quantities[i];
        }

        System.out.println("Total harga yang harus dibayar: " + totalPrice);

        scanner.close();
    }
}
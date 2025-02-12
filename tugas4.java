package belajar;

import java.util.Scanner;

public class tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] barang = {"Beras", "Gula", "Minyak", "Telur", "Susu"};
        int[] stokBarang = {5, 5, 5, 5, 5};
        double[] hargaBarang = {10000, 15000, 20000, 25000, 30000};

        System.out.println("\nSelamat datang di toko Ghani!");
        System.out.println("-----------------------------");

        System.out.print("Masukkan jumlah uang Anda: ");
        double uang = scanner.nextDouble();

        while (true) {
            System.out.println("\nDaftar Barang:");
            for (int i = 0; i < barang.length; i++) {
                System.out.println((i + 1) + ". " + barang[i] + " - Stok: " + stokBarang[i] + " - Harga: " + hargaBarang[i]);
            }

            double totalHarga = 0;

            while (true) {
                System.out.print("\nMasukkan nomor barang yang ingin dibeli (0 untuk selesai): ");
                int pilihan = scanner.nextInt();

                if (pilihan == 0) {
                    break;
                }

                if (pilihan < 1 || pilihan > barang.length) {
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
                }

                System.out.print("Masukkan jumlah yang ingin dibeli: ");
                int jumlah = scanner.nextInt();

                if (jumlah > stokBarang[pilihan - 1]) {
                    System.out.println("Stok tidak mencukupi. Silakan coba lagi.");
                    continue;
                }

                double harga = jumlah * hargaBarang[pilihan - 1];
                if (harga > uang) {
                    System.out.println("Uang tidak mencukupi. Silakan coba lagi.");
                    continue;
                }

                totalHarga += harga;
                stokBarang[pilihan - 1] -= jumlah;
                uang -= harga;

                System.out.println("Anda menambahkan " + jumlah + " " + barang[pilihan - 1] + " ke keranjang.");
            }

            System.out.println("\nTotal harga yang harus dibayar: " + totalHarga);
            System.out.println("Sisa uang Anda: " + uang);
            System.out.println("Sisa stok barang:");
            for (int i = 0; i < barang.length; i++) {
                System.out.println(barang[i] + " - Stok: " + stokBarang[i]);
            }

            System.out.print("\nApakah Anda ingin melanjutkan belanja? (y/n): ");
            char lanjut = scanner.next().charAt(0);

            if (lanjut == 'n' || lanjut == 'N') {
                break;
            }
        }

        System.out.println("\nTerima kasih telah berbelanja di toko Ghani!");
        scanner.close();
    }
}

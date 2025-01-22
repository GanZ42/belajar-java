package belajar;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stokBarang = 5;
        double hargaBarang = 20.0;

        // Meminta pengguna memasukkan jumlah barang yang ingin dibeli
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlahBeli = scanner.nextInt();

        // Meminta pengguna memasukkan saldo mereka
        System.out.print("Masukkan saldo Anda: ");
        double saldoPelanggan = scanner.nextDouble();

        if (jumlahBeli <= stokBarang) {
            double totalHarga = jumlahBeli * hargaBarang;

            if (saldoPelanggan >= totalHarga) {
                System.out.println("Pembelian berhasil!");
                stokBarang -= jumlahBeli;
                saldoPelanggan -= totalHarga;
                System.out.println("Sisa stok: " + stokBarang);
                System.out.println("Sisa saldo: " + saldoPelanggan);
            } else {
                System.out.println("Saldo tidak cukup untuk pembelian.");
            }
        } else {
            System.out.println("Stok barang tidak mencukupi.");
        }

        scanner.close();
    }
}

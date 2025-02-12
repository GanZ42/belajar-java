package belajar;

import java.util.Scanner;

public class lingkaran {
    int jariJari;
    double phi = 3.14; 

    public void hitungLuas() {
        double luas = phi * jariJari * jariJari;
        System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah: " + luas);
    }

    public static void main(String[] args) {
        lingkaran lingkaran = new lingkaran();
        lingkaran.tampil();
    }
    void tampil(){
        Scanner scanner = new Scanner(System.in);
        lingkaran lingkaran = new lingkaran();

        System.out.print("Masukkan jari-jari lingkaran: ");
        lingkaran.jariJari = scanner.nextInt();
        lingkaran.hitungLuas();

    }
}
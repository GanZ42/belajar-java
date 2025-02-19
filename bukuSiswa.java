package belajar;

public class bukuSiswa {
    public static void main(String[] args) {
        buku modul = new buku();
        System.out.println(modul.judul);
        System.out.println(modul.penerbit);
        modul.kategori(); 
    }
}

package belajar;
//latihan void method
public class mobil {
    String warna;
    int tahunProduksi;
    int nomor_mesin;
    int nomor_rangka;
    public static void main(String[] args) {
        mobil mobilNiaga = new mobil();
        //Pemanggilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();
    }
    //Mengisi variabel instance
    void isi(){
        warna = "Merah";
        tahunProduksi = 2018;
        nomor_mesin = 12345;
        nomor_rangka = 6543;
    }
    //Menampilkan isi variabel instance
    void tampil(){
        System.out.println("Warna : " + warna);
        System.out.println("Tahun Produksi : " + tahunProduksi);
        System.out.println("Nomor Mesin : " + nomor_mesin);
        System.out.println("Nomor Rangka : " + nomor_rangka);
    }
}

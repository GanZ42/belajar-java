package belajar;
//latihan method non void
public class mobilku {
    String warna1;
    int tahun_produksi;
    int nomorMesin;
    int nomorRangka;

    //method mengisi variabel instance
    void isi(String warna1, int tahun_produksi, int nomorMesin, int nomorRangka)
    {
        this.warna1 = warna1;
        this.tahun_produksi = tahun_produksi;
        this.nomorMesin = nomorMesin;
        this.nomorRangka = nomorRangka;
    }
    //method menampilkan isi variabel
    String ambil_warna(){
        return warna1;
    }
    int ambil_tahun_produksi(){
        return tahun_produksi;
    }
    int ambil_nomorMesin(){
        return nomorMesin;
    }
    int ambil_nomorRangka(){
        return nomorRangka;
    }
    public static void main(String[] args) {
        mobilku mobilNiaga = new mobilku();
        //Prosws pemanggilan method non void
        mobilNiaga.isi("Putih", 2018, 23456, 6543);
        System.out.println("Warna : " + mobilNiaga.ambil_warna());
        System.out.println("Tahun Produksi : " + mobilNiaga.ambil_tahun_produksi());
        System.out.println("Nomor Mesin : " + mobilNiaga.ambil_nomorMesin());
    }
}

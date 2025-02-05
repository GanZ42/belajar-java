package belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan6 {
    public static void main(String[] args) throws IOException{
        String nama;
        int umur;
        String kelas;
        //Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat objek bufferedreader
        BufferedReader br = new BufferedReader(isr);

        //Mengisi variabel nama dengan BufferedReader
        System.out.print("Inputkan nama Anda : ");
        nama = br.readLine();
        System.out.print("Inputkan umur Anda : ");
        umur = Integer.parseInt(br.readLine());
        System.out.print("Inputkan kelas Anda : ");
        kelas = br.readLine();

        //Menampilkan output isi variabel nama 
        System.out.println("\nNama Anda adalah " + nama);
        System.out.println("Umur " + umur);
        System.out.println("Kelas " + kelas);
    }
}
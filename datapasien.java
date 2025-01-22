package belajar;
import java.util.Scanner;
public class datapasien {
    public static void main(String[] args) {
        int Id_Pasien;
        String Nama_Pasien;

        Scanner Input = new Scanner(System.in);
        System.out.println("DATA PASIEN");
        System.out.println("-----------");

        System.out.print("Id Pasien : ");
        Id_Pasien = Input.nextInt();

        System.out.print("Nama Pasien : ");
        Nama_Pasien = Input.next();

        System.out.println("DATA PASIEN");
        System.out.println("-----------");

        System.out.println("Nama Pasien : " + Id_Pasien);
        System.out.println("Id Pasien : " + Nama_Pasien);

    }
}

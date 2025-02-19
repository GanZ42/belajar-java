package belajar;

public class  karyawan  extends orang{
    Float salary = 4000f;
    String nama = "Hanif";
    int age = 12;

    public karyawan(String string, int i, float f) {
        //TODO Auto-generated constructor stub
    }

    public void showinfo(){
        System.out.println("Nama: " + super.nama);
        System.out.println("Umur: " + super.age);
        System.out.println("salary: $ " + salary);
    }
}

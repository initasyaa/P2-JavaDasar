import java.io.IOException;
import java.util.Scanner;

public class Tugas4_Pratikum {
    public static void main(String[] args) throws IOException {
        //Membuat Scanner & Variabel
        Scanner scan  = new Scanner (System.in);
        char karakter;

        //Mengambil Inputan Dari User
        System.out.print("Masukkan Karakter : ");
        karakter = (char) System.in.read();

        //Percabangan
        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("Ini Karakter Huruf Besar");
        }
        else if (karakter >= 'a' && karakter <= 'z') {
            System.out.println("Ini Karakter Huruf Kecil");
        }
        else if (karakter >= '0' && karakter <= '9') {
            System.out.println("Ini Karakter Angka");
        }
        else {
            System.out.println("Ini Adalah Karakter Khusus");
        }

    }
}